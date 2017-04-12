import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by priyankvex on 12/4/17.
 */
public class MostFrequentSubtreeSum {

    private static class Node {
        Node left;
        Node right;
        int value;
        Node(int n){
            value = n;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(-5);
        solve(root);

    }

    private static Map<Integer, Integer> frequency = new HashMap<>();

    private static int getSumFrequency(Node root){
        if (root == null){
            return 0;
        }
        int sum = root.value + getSumFrequency(root.left) + getSumFrequency(root.right);
        if (frequency.get(sum) == null){
            frequency.put(sum, 1);
        }
        else{
            int temp = frequency.get(sum)+1;
            frequency.put(sum, temp+1);
        }
        return sum;
    }

    private static int[] solve(Node root){
        getSumFrequency(root);
        int maxFreq = 0;
        for (int i : frequency.values()){
            if (i > maxFreq){
                maxFreq = i;
            }
        }
        ArrayList<Integer> num = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()){
            if (entry.getValue() == maxFreq){
                num.add(entry.getKey());
            }
        }
        int n = num.size();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = num.get(i);
        }
        return a;
    }
}

