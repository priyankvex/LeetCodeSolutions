import java.util.ArrayList;

/**
 * Created by priyankvex on 28/4/17.
 */
public class BinaryTreePath {

    private static class Node {
        Node left;
        Node right;
        int value;
        Node (int val){
            value = val;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);

        solve(root);
    }

    private static void solve(Node root){
        solve(root, "");
    }

    private static ArrayList<String> paths = new ArrayList<>();

    private static void solve(Node root, String path){
        if (root == null){
            return;
        }

        if (root.left == null && root.right == null){
            path+=String.valueOf(root.value);
            paths.add(path);
        }

        else{
            path+=String.valueOf(root.value);
            path+="->";
            solve(root.left, (path));
            solve(root.right, (path));
        }
    }
}

