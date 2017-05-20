/**
 * Created by priyankvex on 20/5/17.
 */
public class Subtree {

    private static class Node{
        Node left;
        Node right;
        int value;
        Node (int n){
            value = n;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(1);

        Node temp = new Node(1);

        System.out.println(isSubtree(root, temp));
    }

    private static boolean isSubtree(Node s, Node t){
        if (s == null && t == null){
            return true;
        }
        else if (s == null || t == null){
            return false;
        }
        if (isSameTree(s, t)){
            return true;
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private static boolean isSameTree(Node s, Node t){
        if (s== null && t == null){
            return true;
        }
        else if (s == null || t == null){
            return false;
        }
        else if (s.value == t.value){
            return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
        }
        return false;
    }
}

