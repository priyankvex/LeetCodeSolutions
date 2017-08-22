/**
 * Created by priyankvex on 22/8/17.
 */
public class ArrayNesting {

    public static void main(String[] args) {
        ArrayNesting a = new ArrayNesting();
        int[] nums = new int[]{5,4,0,3,1,6,2};
        int length = a.arrayNesting(nums);
        System.out.println(length);
    }

    public int arrayNesting(int[] nums) {
        int maxLength = 0, current = 0;
        for (int i = 0; i < nums.length; i++){
            current = 0;
            int index = i;
            if (nums[index] > 0){
                while (true){
                    if (nums[index] >= 0){
                        current++;
                        int temp = nums[index];
                        nums[index] = -1;
                        index = temp;
                    }
                    else{
                        break;
                    }
                }
                maxLength = Math.max(maxLength, current);
            }
        }

        return maxLength;
    }
}

