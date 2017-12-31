/**
 * Created by priyankvex on 31/12/17.
 */
public class SingleElementInSortedArray {

    public static void main(String[] args) {

    }

    public int singleNonDuplicate(int[] nums) {
        int single = 0;
        int l=0, h=nums.length-1;
        int mid;
        while (l <= h){
            mid = (l+h)/2;
            if (l == h){
                single = nums[l];
                break;
            }
            int cur = nums[mid];
            int changedIndex = -1;
            int temp = 0;
            if (cur != nums[mid-1]){
                changedIndex = mid-1;
                temp++;
            }
            if (cur != nums[mid+1]){
                changedIndex = mid;
                temp++;
            }

            if (temp == 2){
                single = cur;
                break;
            }

            if ((changedIndex+1)%2 == 0){
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return single;
    }
}

