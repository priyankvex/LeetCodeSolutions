/**
 * Created by priyankvex on 3/9/17.
 */
public class MajorityElement {

    public static void main(String[] args) {

    }

    private int majorityElement(int[] nums) {

        int m = nums[0], c = 0;

        for (int i = 0; i < nums.length; i++){
            if (m == nums[i]){
                c++;
            }
            else{
                c--;
            }
            if (c == 0){
                m = nums[i];
                c =1;
            }
        }

        return m;
    }
}

