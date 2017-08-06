import java.util.Arrays;

/**
 * Created by priyankvex on 6/8/17.
 */
public class ReshapeTheMatrix {

    public static void main(String[] args) {

        ReshapeTheMatrix r = new ReshapeTheMatrix();

        int[][] nums = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };

        int[][] a = r.matrixReshape(nums, 5, 2);

        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] a = new int[r][c];
        int c1 = nums[0].length;
        int r1 = nums.length;

        if (r1 * c1 != r * c) {
            return nums;
        }

        int k = 0, l = 0;

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.println(nums[i][j]);
                System.out.println(k + " " + l);
                a[k][l] = nums[i][j];
                if (l < c - 1) {
                    l++;
                } else {
                    l = 0;
                    k++;
                }
            }
        }

        return a;

    }

}

