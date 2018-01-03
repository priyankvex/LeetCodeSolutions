/**
 * Created by priyankvex on 3/1/18.
 */
public class ArithemticSlices {

    public static void main(String[] args) {

        int[] temp = new int[]{1,2,3,4};
        ArithemticSlices a = new ArithemticSlices();
        a.numberOfArithmeticSlices(temp);
    }

    public int numberOfArithmeticSlices(int[] A) {

        int[] dp = new int[A.length];
        int result = 0;
        dp[2] = A[0] - A[1] == A[1] - A[2] ? 1 : 0;
        for (int i = 3; i < A.length; i++){
            if (A[i] - A[i-1] == A[i-1] - A[i-2]){
                dp[i] = dp[i-1] + 1;
                result+=dp[i];
            }
        }
        return result;
    }
}

