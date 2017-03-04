mport java.util.Stack;

/**
 * Created by priyank on 4/3/17.
 */
public class LongestValidParentheses {

    public static void main(String[] args){

        String s = ")()(((())))(";

        System.out.println(longestValidParentheses(s));

    }

    public static int longestValidParentheses(String s) {

        int count = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '('){
                stack.push(i);
            }
            else {
                if ( !stack.isEmpty() && s.charAt(stack.peek()) == '('){
                    stack.pop();
                }
                else{
                    stack.push(i);
                }
            }
        }

        if (stack.isEmpty()){
            count = s.length();
        }
        else{
            int prev, cur = stack.pop();
            int lastIndex = cur;
            prev = cur;
            while (true){
                int temp = prev - cur -1;
                count = Math.max(temp, count);
                prev = cur;
                if (stack.isEmpty()){
                    break;
                }
                cur = stack.pop();
            }
            count = Math.max(count, cur);
            count = Math.max(count, s.length()-lastIndex-1);
        }

        return count;
    }
}

import java.util.Stack;

/**
 * Created by priyank on 4/3/17.
 */
public class LongestValidParentheses {

    public static void main(String[] args){

        String s = ")()(((())))(";

        System.out.println(longestValidParentheses(s));

    }

    public static int longestValidParentheses(String s) {

        int count = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '('){
                stack.push(i);
            }
            else {
                if ( !stack.isEmpty() && s.charAt(stack.peek()) == '('){
                    stack.pop();
                }
                else{
                    stack.push(i);
                }
            }
        }

        if (stack.isEmpty()){
            count = s.length();
        }
        else{
            int prev, cur = stack.pop();
            int lastIndex = cur;
            prev = cur;
            while (true){
                int temp = prev - cur -1;
                count = Math.max(temp, count);
                prev = cur;
                if (stack.isEmpty()){
                    break;
                }
                cur = stack.pop();
            }
            count = Math.max(count, cur);
            count = Math.max(count, s.length()-lastIndex-1);
        }

        return count;
    }
}

