import java.util.Arrays;

/**
 * Created by priyankvex on 26/8/17.
 */
public class ProductArrayExcepItself {

    public static void main(String[] args) {
        ProductArrayExcepItself p = new ProductArrayExcepItself();
        int[] nums = new int[]{1,2,3,4};
        nums = p.productExceptSelf(nums);
        System.out.println(Arrays.toString(nums));
    }

    private int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int temp = 1;

        for (int i = 0; i < nums.length; i++){
            res[i] = temp;
            temp *= nums[i];
        }
        temp = 1;
        for (int i = nums.length - 1; i >= 0; i--){
            res[i] *= temp;
            temp *= nums[i];
        }

        return res;
    }
}

