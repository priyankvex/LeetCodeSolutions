/**
 * Created by priyankvex on 16/5/17.
 */
public class MaxPathSum {

    private static class Node {
        Node left;
        Node right;
        int value;
        Node (int n){
            value = n;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        maxPathSum(root);

        System.out.println(total);
    }

    private static int total = Integer.MIN_VALUE;

    private static int maxPathSum(Node root){
        if (root == null){
            return 0;
        }
        int ls = maxPathSum(root.left);
        int rs = maxPathSum(root.right);
        int sum = ls + rs + root.value;
        if (sum > total){
            total = sum;
        }
        return Math.max(rs, ls) + root.value;
    }
}

