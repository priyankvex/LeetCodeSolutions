import java.util.*;

/**
 * Created by priyankvex on 19/5/17.
 */
public class InorderTraversal {

    private static class Node {
        Node left;
        Node right;
        int value;
        Node (int n){
            value = n;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);

        List<Integer> a = inorderTraversal(root);

        System.out.println(Arrays.toString(a.toArray()));
    }

    private static List<Integer> inorderTraversal(Node root){
        List<Integer> a = new LinkedList<>();
        Stack<Node> s = new Stack<>();
        Node curNode  = root;
        while (curNode != null || !s.isEmpty()){
            while (curNode != null){
                s.push(curNode);
                curNode = curNode.left;
            }
            curNode = s.pop();
            a.add(curNode.value);
            curNode = curNode.right;
        }

        return a;
    }
}

