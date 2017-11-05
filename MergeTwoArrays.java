import java.util.Arrays;

/**
 * Created by priyankvex on 5/11/17.
 */
public class MergeTwoArrays {

    public static void main(String[] args) {

        MergeTwoArrays m = new MergeTwoArrays();
        int m1 = 1, n = 1;
        int[] A = new int[]{2,0};
        int[] B = new int[]{1};
        m.merge(A, m1,  B, n);
        System.out.println(Arrays.toString(A));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int j = n-1;
        int i = m-1;
        int index = m+n-1;

        while (j >= 0){
            if (i >= 0 && nums1[i] > nums2[j]){
                System.out.println("here");
                nums1[index] = nums1[i];
                System.out.println(Arrays.toString(nums1));
                i--;
            }
            else{
                nums1[index] = nums2[j];
                j--;
            }
            index--;
        }
    }

}

