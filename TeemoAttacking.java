/**
 * Created by priyankvex on 20/8/17.
 */
public class TeemoAttacking {

    public static void main(String[] args) {
        TeemoAttacking t = new TeemoAttacking();
        int[] nums = new int[]{1,2};
        int k = 2;
        int result = t.findPoisonedDuration(nums, k);
        System.out.println(result);
    }

    private int findPoisonedDuration(int[] timeSeries, int duration) {
        int limit = 0;
        int total = 0;
        for (int n : timeSeries){
            if (n >= limit){
                // no overlapping
                total+=duration;
                limit = n + duration;
            }
            else{
                // overlapping
                total+=duration-(limit-n);
                limit = n+duration;
            }
        }

        return total;
    }
}

