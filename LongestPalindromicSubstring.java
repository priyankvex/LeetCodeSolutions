/**
 * Created by priyank on 21/2/17.
 */
public class LongestPalindromicSubstring {

    public static void main(String[] args){

        String s = "a";
        s = longestPalindrome(s);
        System.out.println(s);

    }

    static int longest = 0, start = 0;

    public static String longestPalindrome(String s) {

        for (int i = 0; i < s.length(); i++){
            findPalindrome(s, i, i); // for odd length
            findPalindrome(s, i, i+1); // for even length
        }
        return s.substring(start, start+longest);
    }

    private static void findPalindrome(String s, int j, int k){

        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)){
            j--;
            k++;
        }
        j++;
        k--;
        int length = k-j+1;
        if (length > longest){
            longest = length;
            start = j;
        }
    }
}

