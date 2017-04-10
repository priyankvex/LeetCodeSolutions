import java.util.ArrayList;
import java.util.List;

/**
 * Created by priyankvex on 10/4/17.
 */
public class TreeLargestRowValue {

    private static class Node {
        Node right;
        Node left;
        int value;
        Node(int n){
            value = n;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(13);
        root.left.left = new Node(1);
        root.right.left = new Node(11);
        root.right.right = new Node(15);

        List<Integer> list = solve(root);

        for (int i : list){
            System.out.print(i + " ");
        }

    }

    private static List<Integer> solve(Node root){
        int n = getHeight(root);
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++){
            list.add(Integer.MIN_VALUE);
        }
        solve(root, 0, list);
        return list;
    }

    private static void solve(Node root, int level, List<Integer> list){
        if (root == null){
            return;
        }
        int temp = Math.max(list.get(level), root.value);
        list.set(level, temp);
        solve(root.left, level+1, list);
        solve(root.right, level+1, list);
    }

    private static int getHeight(Node root){
        if (root == null){
            return 0;
        }
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        return Math.max(lh, rh) + 1;
    }
}

