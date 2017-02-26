/*
Created by priyank on 27/2/17.
*/
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args){

        int[] a = new int[]{1,2,3,4,5,6,6};

        int size = removeDuplicates(a);

        System.out.println(size);
    }

    public static int removeDuplicates(int[] nums) {

        int j = 0, n = nums.length;

        for (int i = 0; i < n-1; i++){
            if (nums[i] != nums[i+1]){
                j++;
                nums[j] = nums[i+1];
            }
        }

        //System.out.println(Arrays.toString(nums));

        return j+1;
    }
}

