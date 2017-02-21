import java.util.*;
import java.util.LinkedList;

/**
 * Created by priyank on 21/2/17.
 */
public class ReverseInteger {

    public static void main(String[] args){

        int n = -123;
        n = reverse(n);
        System.out.println(n);
    }

    public static int reverse(int x) {

        Queue<Integer> queue = new LinkedList<>();

        boolean isPositive = x > 0;
        x = Math.abs(x);

        while (x > 0){
            int place = x%10;
            x = x/10;
            queue.add(place);
        }

        x = 0;
        int n = queue.size();
        for (int i = n-1; i >= 0; i--){
            int temp = queue.poll();
            x += (Math.pow(10, i)*temp);
        }
        if (!isPositive){
            x*=-1;
        }

        if (x > 2147483646 || x < -2147483646){
            return 0;
        }
        else{
            return x;
        }
    }
}

