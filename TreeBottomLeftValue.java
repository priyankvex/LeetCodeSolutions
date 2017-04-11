/**
 * Created by priyankvex on 11/4/17.
 */
public class TreeBottomLeftValue {

    private static class Node {
        Node left;
        Node right;
        int value;
        Node(int n){
            value = n;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);

        int value = solve(root);

        System.out.println(value);
    }

    private static Node leftMostNode;
    private static int lowestLevel = 0;

    private static void getLeftMostNode(Node root, int level){
        if (root == null){
            return;
        }
        if (lowestLevel <= level){
            leftMostNode = root;
            lowestLevel = level;
        }
        if (lowestLevel <= level && root.left != null){
            leftMostNode = root.left;
            lowestLevel = level;
        }
        getLeftMostNode(root.right, level+1);
        getLeftMostNode(root.left, level+1);
    }

    private static int solve(Node root){
        getLeftMostNode(root, 0);
        return leftMostNode.value;
    }
}

