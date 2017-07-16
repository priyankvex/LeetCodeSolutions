/**
 * Created by priyankvex on 16/7/17.
 */
public class MergeBinaryTree {

    private static class Node {
        Node left;
        Node right;
        int value;
        Node(int n){
            value  = n;
        }
    }

    private static Node merge(Node n1, Node n2){
        if (n1 == null && n2 == null){
            return null;
        }
        Node root = new Node(0);
        boolean n1_null = true;
        boolean n2_null = true;
        if (n1 != null){
            root.value += n1.value;
            n1_null = false;
        }
        if (n2 != null){
            root.value += n2.value;
            n2_null = false;
        }
        if (!n1_null && !n2_null){
            root.left = merge(n1.left, n2.left);
            root.right = merge(n1.right, n2.right);
        }
        else if (n1_null){
            root.left = merge(null, n2.left);
            root.right = merge(null, n2.right);
        }
        else{
            root.left = merge(n1.left, null);
            root.right = merge(n1.right, null);
        }
        return root;
    }
}

