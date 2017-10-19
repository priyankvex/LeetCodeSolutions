/**
 * Created by priyankvex on 19/10/17.
 */
public class FindPeakElement {

    public static void main(String[] args) {
        FindPeakElement p = new FindPeakElement();
        int[] nums = new int[]{1,2,3,4,5};
        int peakIndex = p.findPeakElement(nums);
        System.out.println(peakIndex);
    }

    public int findPeakElement(int[] nums) {
        int l = nums.length;
        if (l == 1){
            return 0;
        }
        if (nums[0] > nums[1]){
            return 0;
        }
        for (int i = 1; i < l-1; i++){

            if (nums[i] > nums[i-1] && nums[i] > nums[i+1]){
                return i;
            }
        }
        if (nums[l-1] > nums[l-2]){
            return l-1;
        }
        return -1;
    }

}

