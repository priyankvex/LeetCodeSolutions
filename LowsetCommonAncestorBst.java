/**
 * Created by priyankvex on 2/5/17.
 */
public class LowestCommonAncestorBst {

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

    private static Node solve(Node root, Node p, Node q){
        if (root.value > p.value && root.value > q.value){
            return  solve(root.left, p, q);
        }
        else if (root.value < p.value && root.value < q.value){
            return solve(root.right, p, q);
        }
        else{
            return root;
        }
    }
}

