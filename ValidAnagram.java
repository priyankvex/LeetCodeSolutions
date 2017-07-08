/**
 * Created by priyankvex on 8/7/17.
 */
public class ValidAnagram {

    public static void main(String[] args){

        boolean status = isAnagram("anagram", "nagaram");
        System.out.println(status);
    }

    private static boolean isAnagram(String s, String t){
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++){
            a[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < t.length(); i++){
            a[t.charAt(i) - 97]--;
        }
        for (int i = 0; i < 26; i++){
            if (a[i] != 0){
                return false;
            }
        }
        return true;
    }
}

