/**
 * Created by priyankvex on 19/5/17.
 */
public class SameTree {

    private static class Node {
        Node left;
        Node right;
        int value;
        Node (int x){
            value = x;
        }
    }

    public static void main(String[] args) {

    }

    private static boolean isSameTree(Node p, Node q){
        if (p == null && q == null){
            return true;
        }
        else if (p == null || q == null){
            return false;
        }
        if (p.value == q.value){
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }
}

