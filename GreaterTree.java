/**
 * Created by priyankvex on 9/4/17.
 */
public class GreaterTree {

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
        root.right = new Node(13);

        printInOrder(root);
        solve(root);
        printInOrder(root);
    }

    private static int sum = 0;

    private static void solve(Node root){
        if (root == null){
            return;
        }
        solve(root.right);
        int temp = root.value;
        root.value += sum;
        sum += temp;
        solve(root.left);
    }

    private static void printInOrder(Node root){
        if (root == null){
            return;
        }
        printInOrder(root.left);
        System.out.print(root.value + " ");
        printInOrder(root.right);
    }
}

