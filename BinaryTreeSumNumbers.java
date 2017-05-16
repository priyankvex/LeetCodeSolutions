/**
 * Created by priyankvex on 16/5/17.
 */
public class BinaryTreeSumNumbers {

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

        sumNumbers(root);

        System.out.println(total);
    }

    private static int total = 0;

    private static int sumNumbers(Node root){
        helper(root, 0);
        return total;
    }

    private static void helper(Node root, int num){
        if (root == null){
            return;
        }
        num = num*10 + root.value;
        if (root.left != null){
            helper(root.left, num);
        }
        if (root.right != null){
            helper(root.right, num);
        }
        if (root.left == null && root.right == null){
            total += num;
        }
    }
}

