import java.util.HashMap;

/**
 * Created by priyank on 19/2/17.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args){

        String s = "abcdefabc";
        int count = lengthOfLongestSubstring(s);
        System.out.println(count);
    }

    public static int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int longest = 0, m = 0;

        for (int i = 0 ; i < s.length(); i++){
            Character c = s.charAt(i);
            if (map.containsKey(c)){
                // this character we have seen before
                m = Math.max(m, map.get(c)+1);
            }
            // update the index of the char
            map.put(c, i);
            longest = Math.max(longest, i-m+1);
        }

        return longest;
    }
}

