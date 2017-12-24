/**
 * Created by priyankvex on 24/12/17.
 */
public class MaximumTree {

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {

    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildTree(nums, 0, nums.length-1);
    }

    private TreeNode buildTree(int[] a, int start, int end){
        if (end == a.length || start > end){
            return null;
        }
        int i = findMax(a, start, end);
        TreeNode node = new TreeNode(a[i]);
        node.right = buildTree(a, i+1, end);
        node.left = buildTree(a, start, i-1);
        return node;
    }

    private int findMax(int[] a, int start, int end){
        int max = start;
        for (int i = start+1; i <= end; i++){
            if (a[i] > a[max]){
                max = i;
            }
        }
        return max;
    }
}

