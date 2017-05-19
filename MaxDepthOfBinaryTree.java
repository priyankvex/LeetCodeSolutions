/**
 * Created by priyankvex on 19/5/17.
 */
public class MaxDepthOfBinaryTree {

    private static class Node {
        Node left;
        Node right;
        int value;
        Node (int n){
            value = n;
        }
    }

    public static void main(String[] args) {

    }

    private static int maxDepth(Node root){
        if (root == null){
            return 0;
        }

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return Math.max(lh, rh) + 1;
    }
}

