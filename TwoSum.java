import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by priyank on 19/2/17.
 */
public class TwoSum {

    public static void main(String[] args){

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));

    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];
            if (map.containsKey(compliment) && map.get(compliment) != i){
                return new int[] {i, map.get(compliment)};
            }
        }

        return null;
    }
}

