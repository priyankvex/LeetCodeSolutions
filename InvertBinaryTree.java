/**
 * Created by priyankvex on 7/5/17.
 */
public class InvertBinaryTree {

    private static class Node {
        Node right;
        Node left;
        int value;
        Node (int n){
            value = n;
        }
    }

    public static void main(String[] args) {

    }

    private Node invertTree(Node root){
        if (root == null){
            return null;
        }
        Node left = root.left;

        root.left = root.right;
        root.right = left;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}

