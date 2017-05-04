import java.util.Stack;

/**
 * Created by priyankvex on 4/5/17.
 */
public class kthSmallestElementInTree {

    private static class Node {
        Node left;
        Node right;
        int value;
        Node(int n){
            value = n;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(15);
        root.left.left = new Node(6);
        root.left.right = new Node(9);
        root.right.left = new Node(12);
        root.right.right = new Node(17);

        s = new Stack<>();
        s.clear();

        kthSmallest(root, 3);
    }

    private static Stack<Node> s = new Stack<>();

    private static Node kthSmallest(Node root, int k){
        solve(root, k);
        System.out.println(s.peek().value);
        return s.peek();
    }

    private static void solve(Node root, int k){
        if (s.size() == k || root == null){
            return;
        }
        solve(root.left, k);
        if (s.size() != k){
            s.push(root);
        }
        solve(root.right, k);
    }
}

