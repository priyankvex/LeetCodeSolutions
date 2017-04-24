/**
 * Created by priyankvex on 24/4/17.
 */
public class BinaryTilt {

    private static class Node {
        Node right;
        Node left;
        int value;
        Node (int n){
            value = n;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(5);
        root.left.right = new Node(10);
        root.right = new Node(3);
        root.right.left = new Node(7);

        int tilt = tilt(root);

        System.out.println(tilt);
    }

    private static int tiltSum = 0;

    private static int tilt(Node root){
        postOrder(root);
        return tiltSum;
    }

    private static int postOrder(Node root){
        if (root == null){
            return 0;
        }
        int ls = postOrder(root.left);
        int rs = postOrder(root.right);
        tiltSum+= Math.abs(rs - ls);
        return rs+ls+root.value;
    }
}

