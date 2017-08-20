import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by priyankvex on 20/8/17.
 */
public class FindDisappearedNumbers {

    public static void main(String[] args) {
        FindDisappearedNumbers f = new FindDisappearedNumbers();
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        List<Integer> l = f.findDisappearedNumbers(nums);
        System.out.println(Arrays.toString(l.toArray()));
    }

    private List<Integer> findDisappearedNumbers(int[] nums) {

        for (int num : nums){
            int index = Math.abs(num) - 1;
            nums[index] = nums[index] > 0 ? -nums[index] : nums[index];
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0){
                list.add(i+1);
            }
        }

        return list;
    }
}

