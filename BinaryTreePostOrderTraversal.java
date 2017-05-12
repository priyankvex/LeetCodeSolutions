import java.util.*;

/**
 * Created by priyankvex on 12/5/17.
 */
public class BinaryTreePostOrderTraversal {

    private static class Node {
        Node left;
        Node right;
        int value;
        Node (int n){
            value =  n;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);

        List<Integer> a = solve(root);

        System.out.println(Arrays.toString(a.toArray()));
    }

    private static List<Integer> solve(Node root){
        Stack<Node> s = new Stack<>();
        List<Integer> a = new ArrayList<>();
        if (root == null){
            return a;
        }
        s.push(root);
        while (!s.isEmpty()){

            Node temp = s.pop();

            a.add(temp.value);

            if (temp.left != null){
                s.add(temp.left);
            }
            if (temp.right != null){
                s.add(temp.right);
            }
        }
        Collections.reverse(a);
        return a;
    }

}

