import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by priyankvex on 12/5/17.
 */
public class BinaryTreeRightSideView {

    private static class Node {
        Node right;
        Node left;
        int value;
        Node (int n){
            value = n;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);
        root.right.right = new Node(4);

        int h = getHeight(root);
        a = new ArrayList<>(h);
        for (int i = 0; i < h; i++){
            a.add(0);
        }
        System.out.println(Arrays.toString(rightSideView(root).toArray()));

    }

    public static List<Integer> rightSideView(Node root) {
        solve(root, 0);
        return a;
    }

    private static List<Integer> a;

    private static void solve(Node root, int l){
        if (root == null){
            return;
        }
        a.set(l, root.value);
        solve(root.left, l+1);
        solve(root.right, l+1);
    }

    private static int getHeight(Node root){
        if (root == null){
            return 0;
        }
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        return Math.max(lh, rh)+1;
    }
}

