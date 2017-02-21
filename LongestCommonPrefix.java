/*
reated by priyank on 22/2/17.
 */
public class LongestCommonPrefix {

    public static void main(String[] args){

        String[] strs = {"aa", "aa"};
        String prefix = longestCommonPrefix(strs);
        System.out.println(prefix);
    }

    public static String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
            i++;
        }
        return pre;
    }
}

