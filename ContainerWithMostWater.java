/*
created by priyank on 21/2/17.
 */
public class ContainerWithMostWater {

    public static void main(String[] args){
        int[] a = {1,3,2,4,5,2};
        int area = maxArea(a);
        System.out.println(area);
    }

    public static int maxArea(int[] a) {

        int max = 0, left = 0, right = a.length-1;

        while (left < right){

            max = Math.max(max, (Math.min(a[left], a[right]))*(right-left) );
            if (a[left] < a[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return max;
    }
}

