/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    private  HashMap<Integer, Integer> m = new HashMap<>();
    private int count = 0;
    
    public int pathSum(TreeNode root, int sum) {
        m.put(0,1);
        pathSum(root, sum, 0);
        return count;    
    }
    
    private void pathSum(TreeNode root, int target, int currentSum){
        if (root == null){
            return;
        }
        currentSum += root.val;
        count += m.getOrDefault(currentSum - target, 0);
        m.put(currentSum, m.getOrDefault(currentSum, 0) + 1);
        
        pathSum(root.left,target, currentSum);
        pathSum(root.right, target, currentSum);
        
        m.put(currentSum, m.get(currentSum) -1);
    }
}
