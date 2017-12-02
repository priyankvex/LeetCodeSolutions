public class MaximumLengthSubArray {

    public static void main(String[] args) {


    }

    public int findLength(int[] a, int[] b){
        int max = 0;
        int n = a.length;
        int m = b.length;
        int[][] dp = new int[n+1][m+1];
        for (int i = 0 ; i <= n; i++){
            for (int j = 0; j <= m; j++){
                if (i == 0 || j == 0){
                    dp[i][j] = 0;
                }
                else{
                    if (a[i-1] == b[j-1]){
                        dp[i][j] = dp[i-1][j-1] + 1;
                        max = Math.max(max, dp[i][j]);
                    }
                }
            }
        }

        return max;
    }
}

