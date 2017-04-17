/**
 * Created by priyankvex on 14/4/17.
 */
public class DeleteNodeBst {

    private static class Node {
        Node left;
        Node right;
        int value;
        Node(int n){
            value = n;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(7);
        root.right.right = new Node(15);

        int key = 5;

        inorder(root);
        System.out.print("\n");
        solve(root, key);
        inorder(root);
    }

    private static Node solve(Node root, int key){
        if (root == null){
            return null;
        }
        else if (root.value > key){
            root.left = solve(root.left, key);
        }
        else if (root.value < key){
            root.right = solve(root.right, key);
        }
        else{
            if (root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }
            Node temp = getMin(root.right);
            root.value = temp.value;
            root.right = solve(root.right, temp.value);
        }

        return root;

    }

    private static Node getMin(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }

    private static void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.value +" ");
        inorder(root.right);
    }
}

