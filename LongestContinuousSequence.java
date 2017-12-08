/**
 * Created by priyankvex on 8/12/17.
 */
public class LongestContinuousSequence {

    public static void main(String[] args) {

        LongestContinuousSequence l = new LongestContinuousSequence();
        int[] temp = new int[]{
            4,0,-4,-2,2,5,2,0,-8,-8,-8,-8,-1,7,4,5,5,-4,6,6,-3
        };
        int res = l.longestConsecutive(temp);
        System.out.println(res);
    }

    public int longestConsecutive(int[] nums) {

        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.get(nums[i]) == null){
                int leftCount = map.getOrDefault(nums[i]-1, 0);
                int rightCount = map.getOrDefault(nums[i]+1, 0);
                int total = leftCount + rightCount + 1;
                map.put(nums[i]-leftCount, total);
                map.put(nums[i]+rightCount, total);
                map.put(nums[i], total);
                max = Math.max(max, total);
            }
        }

        return max;

    }


}

