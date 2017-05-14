import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by priyankvex on 14/5/17.
 */
public class BinaryTreePreOrderTraversal {

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
        root.right = new Node(2);
        root.right.left = new Node(3);

        List<Integer> a = solve(root);

        System.out.println(Arrays.toString(a.toArray()));
    }

    private static List<Integer> solve(Node root){
        Stack<Node> s = new Stack<>();
        List<Integer> a = new LinkedList<>();
        if (root != null){
            s.push(root);
        }
        while (!s.isEmpty()){
            Node temp = s.pop();
            a.add(temp.value);
            if (temp.right != null){
                s.add(temp.right);
            }
            if (temp.left != null){
                s.add(temp.left);
            }
        }

        return a;
    }
}

