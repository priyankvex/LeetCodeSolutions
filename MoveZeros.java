import java.util.Arrays;

/**
 * Created by priyankvex on 22/8/17.
 */
public class MoveZeros {

    public static void main(String[] args) {
        MoveZeros m = new MoveZeros();
        int[] nums = new int[]{0, 1, 0, 3, 12};
        m.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    private void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }

        for (int i = index; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}


