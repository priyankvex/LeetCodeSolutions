/**
 * Created by priyankvex on 28/9/17.
 */
public class FindDuplicateNumber {

    public static void main(String[] args) {

        FindDuplicateNumber f = new FindDuplicateNumber();
        int[] nums = new int[]{1,4,4,2,4};
        int duplicate = f.findDuplicate(nums);
        System.out.println(duplicate);
    }

    public int findDuplicate(int[] nums) {

        int n = nums.length-1;
        int low = 1, high = n;
        int mid;

        while (low < high){
            int count = 0;
            mid = (low+high)/2;
            for (int a : nums){
                if (a >= low && a <= mid){
                    count++;
                }
            }
            if (count > (mid-low+1)){
                high = mid;
            }
            else{
                low = mid+1;
            }
        }

        return low;
    }
}

