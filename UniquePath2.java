/**
 * Created by priyankvex on 13/11/17.
 */
public class UniquePath2 {

    public static void main(String[] args) {

        int[][] temp = new int[][]{
                {0, 0}, {0, 0}
        };

        UniquePath2 u = new UniquePath2();

        System.out.println(u.uniquePathsWithObstacles(temp));
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;

        int[][] dp = new int[n][m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){

                if (obstacleGrid[i][j] == 1){
                    continue;
                }

                if (i == 0 && j == 0){
                    dp[i][j] = 1;
                    continue;
                }
                else if (i == 0){
                    dp[i][j] = dp[i][j-1];
                    continue;
                }
                else if (j == 0){
                    dp[i][j] = dp[i-1][j];
                    continue;
                }

                int way1 = obstacleGrid[i-1][j] == 1 ? 0 : dp[i-1][j];
                int way2 = obstacleGrid[i][j-1] == 1 ? 0 : dp[i][j-1];

                dp[i][j] = way1 + way2;
            }
        }

        return dp[n-1][m-1];
    }
}

