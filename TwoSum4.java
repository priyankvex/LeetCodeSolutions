import java.util.HashMap;

/**
 * Created by priyankvex on 2/9/17.
 */
public class TwoSum4 {

    private static class TreeNode{
        TreeNode left;
        TreeNode right;
        int value;
        TreeNode(int value){
            this.value = value;
        }
    }

    public static void main(String[] args) {

    }

    HashMap<Integer, Boolean> map =  new HashMap<>();

    public boolean findTarget(TreeNode root, int k) {

        if (root == null){
            return false;
        }

        if (map.get(k - root.value) != null){
            return true;
        }
        map.put(root.value, true);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}

