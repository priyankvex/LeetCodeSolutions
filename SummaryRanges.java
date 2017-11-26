import java.util.ArrayList;
import java.util.List;

/**
 * Created by priyankvex on 26/11/17.
 */
public class SummaryRanges {

    public static void main(String[] args) {

        int[] temp = new int[]{0,2,3,4,6,8,9};
        SummaryRanges s = new SummaryRanges();
        System.out.print(s.summaryRanges(temp));
    }

    public List<String> summaryRanges(int[] nums) {

        List<String> s = new ArrayList<>();

        int s1 = -1;
        int prev = -1;

        for (int i = 0; i < nums.length; i++){
            if (prev == -1){
                s1 = i;
                prev = i;
                continue;
            }
            if (nums[prev] + 1 == nums[i]){
                prev = i;
                continue;
            }
            if (prev == s1){
                // only one element in the range
                s.add(String.valueOf(nums[s1]));
                s1 = i;
                prev=i;
            }
            else{
                s.add(String.valueOf(nums[s1]+"->"+nums[prev]));
                s1 = i;
                prev=i;
            }
        }

        if (nums.length != 0 && s1 == prev){
            s.add(String.valueOf(nums[prev]));
        }
        else if (nums.length != 0) {
            s.add(String.valueOf(nums[s1]+"->"+nums[prev]));
        }


        return s;
    }
}

