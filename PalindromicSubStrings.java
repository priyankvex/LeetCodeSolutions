/**
 * Created by priyankvex on 1/1/18.
 */
public class PalindromicSubStrings {

    public static void main(String[] args) {

        String s = "abc";
        PalindromicSubStrings p = new PalindromicSubStrings();
        System.out.println(p.countSubstrings(s));
    }

    public int countSubstrings(String s) {

        int centers = 2*s.length() - 1;
        int answer = 0;
        for (int c = 0; c < centers; c++){
            int left = c/2;
            int right = c%2 == 0? c/2: (c/2)+1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                answer++;
                left--;
                right++;
                System.out.println(answer);
            }
        }
        return answer;
    }
}

