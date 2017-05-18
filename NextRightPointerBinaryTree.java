/**
 * Created by priyankvex on 18/5/17.
 */
public class NextRightPointerBinaryTree {

    private static class Node {
        Node left;
        Node right;
        Node next;
        int value;
        Node (int n){
            value = n;
        }
    }

    public static void main(String[] args) {

    }

    private static void connect(Node root){
        if (root == null){
            return;
        }
        if (root.left != null && root.right != null){
            root.left.next = root.right;
        }
        if (root.next != null && root.right != null){
            root.right.next = root.next.left;
        }
        connect(root.left);
        connect(root.right);
    }
}

