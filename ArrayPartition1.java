import java.util.Arrays;

/**
 * Created by priyankvex on 5/8/17.
 */
public class ArrayPartition1 {

    public static void main(String[] args){
        ArrayPartition1 a = new ArrayPartition1();
        int[] nums = new int[] {1,4,3,2};
        System.out.println(a.arrayPairSum(nums));
    }

    int arrayPairSum(int[] nums) {
        int sum = 0;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i = i+2){
            sum+=nums[i];
        }

        return sum;
    }
}

