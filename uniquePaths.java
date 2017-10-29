import java.util.Arrays;

/**
 * Created by priyankvex on 29/10/17.
 */
public class UniquePaths {

    public static void main(String[] args) {

        UniquePaths u = new UniquePaths();
        u.uniquePaths(2, 4);
    }

    public int uniquePaths(int n, int m) {

        if (m > n){
            return uniquePaths(m, n);
        }
        int[] a = new int[n];
        Arrays.fill(a, 1);
        for (int i = 1; i < m; i++){
            for (int j = 1;  j<n; j++){
                a[j] = a[j] + a[j-1];
            }
        }

        System.out.println(Arrays.toString(a));

        return a[n-1];
    }
}

