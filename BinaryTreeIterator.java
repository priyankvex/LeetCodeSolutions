import java.util.Stack;

/**
 * Created by priyankvex on 22/5/17.
 */
public class BinaryTreeIterator {

    private static class TreeNode {
        TreeNode left;
        TreeNode right;
        int value;
        TreeNode(int n){
            value = n;
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        BinaryTreeIterator b = new BinaryTreeIterator(root);
        System.out.println(b.next());

    }

    private static Stack<TreeNode> s;

    public BinaryTreeIterator(TreeNode root) {
        s = new Stack<>();
        TreeNode temp = root;
        while (temp != null){
            s.push(temp);
            temp = temp.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !s.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode node = s.pop();
        TreeNode temp = node;
        if (node.right != null){
            temp  = node.right;
            while (temp != null){
                s.push(temp);
                temp = temp.left;
            }
        }

        return node.value;
    }
}

