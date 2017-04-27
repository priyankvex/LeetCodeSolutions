import java.util.HashMap;

/**
 * Created by priyankvex on 27/4/17.
 */
public class HouseRobber3 {

    private static class Node {
        Node left;
        Node right;
        int value;
        Node (int n){
            value = n;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(3);
        root.right.right = new Node(1);

        int sum = solve(root);

        System.out.println(sum);
    }

    private static HashMap<Node, Integer> map = new HashMap<>();

    private static int solve(Node root){
        if (root == null){
            return 0;
        }
        if (map.containsKey(root)){
            return map.get(root);
        }
        int val = 0;
        if (root.left != null){
            val+=solve(root.left.left);
            val+=solve(root.left.right);
        }
        if (root.right != null){
            val+=solve(root.right.left);
            val+=solve(root.right.right);
        }
        int result = Math.max(val+root.value, solve(root.left) + solve(root.right));
        map.put(root, result);
        return result;
    }
}

