/**
 * Created by priyankvex on 8/5/17.
 */
public class CountTreeNodes {

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
        root.left.left = new Node(4);
        root.right = new Node(3);

        nodeCount = count(root);

        System.out.println(nodeCount);
    }


    private static int nodeCount = 0;

    private static int count (Node root){
        if (root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        if (lh == rh){
            return 1 + ( (int) (Math.pow(2, lh)) - 1) + count(root.right);
        }
        else{
            return 1 + ( (int) (Math.pow(2, rh)) - 1) + count(root.left);
        }
    }

    private static int height(Node root){
        int h = 0;
        while(root != null){
            h++;
            root = root.left;
        }
        return h;
    }
}

