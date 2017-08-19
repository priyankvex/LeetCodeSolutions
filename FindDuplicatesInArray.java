import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by priyankvex on 19/8/17.
 */
public class FindDuplicatesInArray {

    public static void main(String[] args) {

        FindDuplicatesInArray f = new FindDuplicatesInArray();
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        List<Integer> list = f.findDuplicates(nums);
        System.out.println(Arrays.toString(list.toArray()));
    }

    List<Integer> findDuplicates(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            int temp = nums[Math.abs(nums[i])-1];
            if (temp < 0){
                list.add(Math.abs(nums[i]));
            }
            else{
                nums[Math.abs(nums[i])-1] = temp*(-1);
            }
        }

        return list;
    }
}

