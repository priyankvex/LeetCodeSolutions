/**
 * Created by priyankvex on 19/8/17.
 */
public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        MaxConsecutiveOnes m = new MaxConsecutiveOnes();
        int[] nums = new int[]{1,1,0,1,1,1};
        int max = m.findMaxConsecutiveOnes(nums);
        System.out.println(max);
    }

    int findMaxConsecutiveOnes(int[] nums) {
        int currentLength = 0, maxLength = 0;
        for (int num : nums) {
            if (num == 1) {
                currentLength++;
            } else {
                maxLength = currentLength > maxLength ? currentLength : maxLength;
                currentLength = 0;
            }
        }
        maxLength = currentLength > maxLength ? currentLength : maxLength;

        return maxLength;
    }
}

