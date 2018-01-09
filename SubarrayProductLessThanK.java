/**
 * Created by priyankvex on 9/1/18.
 */
public class SubarrayProductLessThanK {

    public static void main(String[] args) {

    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int total = 0;
        int left = 0, right = 0;
        int p = 1;
        for (right = 0; right < nums.length; right++){
            p = p * nums[right];
            while (p >= k){
                left++;
                p = p / nums[left];
            }
            total = total + (right - left + 1);
        }

        return total;
    }
}

