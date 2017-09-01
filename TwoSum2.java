import java.util.Arrays;

/**
 * Created by priyankvex on 2/9/17.
 */
public class TwoSum2 {

    public static void main(String[] args) {
        TwoSum2 t = new TwoSum2();
        int[] nums = new int[]{1,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(t.twoSum(nums, 11)));
    }

    private int[] twoSum(int[] nums, int target) {

        int left = 0, right = nums.length -1;
        boolean found = false;

        while (left < right){
            int temp = nums[right] + nums[left];
            if (temp == target){
                found = true;
                break;
            }
            else if (temp > target){
                right--;
            }
            else{
                left++;
            }
        }

        return new int[]{++left, ++right};

    }
}

