import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by priyankvex on 13/4/17.
 */
public class ModeInBst {

    private static class Node {
        Node right;
        Node left;
        int value;
        Node(int n){
            value = n;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(2);

        solve(root);
    }

    private static Map<Integer, Integer> map = new HashMap<>();

    private static void getFrequncyTree(Node root){
        if (root == null){
            return;
        }
        getFrequncyTree(root.left);
        if (map.get(root.value) == null){
            map.put(root.value, 1);
        }
        else{
            map.put(root.value, map.get(root.value)+1);
        }
        getFrequncyTree(root.right);
    }

    private static int[] solve(Node root){
        getFrequncyTree(root);
        int maxCount = Integer.MIN_VALUE;
        for (int i : map.values()){
            if (i > maxCount){
                maxCount = i;
            }
        }
        ArrayList<Integer> nums = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == maxCount){
                nums.add(entry.getKey());
            }
        }

        int[] a = new int[nums.size()];

        for (int i = 0; i < nums.size(); i++){
            a[i] = nums.get(i);
        }

        return a;
    }

}

