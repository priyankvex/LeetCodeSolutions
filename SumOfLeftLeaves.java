/**
 * Created by priyankvex on 26/4/17.
 */
public class SumOfLeftLeaves {

    private static class Node {
        Node right;
        Node left;
        int value;
        Node(int n){
            value = n;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        solve(root);

        System.out.println(sum);
    }

    private static int sum = 0;

    private static void solve(Node root){
        if (root == null){
            return;
        }
        if (root.left != null){
            if (root.left.left == null && root.left.right == null){
                // a left leaf node
                sum+=root.left.value;
            }
        }
        solve(root.left);
        solve(root.right);
    }
}

