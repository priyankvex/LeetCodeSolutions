/**
 * Created by priyankvex on 22/5/17.
 */
public class SortedArrayToTree {

    private static class Node {
        Node left;
        Node right;
        int value;
        Node (int n){
            value = n;
        }
    }

    public static void main(String[] args) {

    }

    private static Node sortedArrayToBST(int[] nums){
        return buildTree(null, 0, nums.length-1, nums);
    }

    private static Node buildTree(Node root, int low, int high, int[] a){
        if (low > high){
            return root;
        }
        if (root == null){
            root = new Node(0);
        }
        int index = (low+high)/2;
        root.value = a[index];
        root.left = buildTree(root.left, low, index-1, a);
        root.right = buildTree(root.right, index+1, high, a);

        return root;
    }
}

