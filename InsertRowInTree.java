/**
 * Created by priyankvex on 16/7/17.
 */
public class InsertRowInTree {

    private static class Node{
        Node left;
        Node right;
        int value;
        Node(int n){
            value = n;
        }
    }

    public static void main(String[] args){

    }

    private static Node solve(Node root, int v, int d){

        return insertRow(root, v, d, 1);
    }

    private static Node insertRow(Node root, int v, int d, int height){

        if (root == null){
            return root;
        }
        if (d == 1){
            Node temp = new Node(v);
            temp.left = root;
            return temp;
        }
        else if (height+1 == d){
            Node temp = new Node(v);
            Node temp2 = new Node(v);
            temp.left = root.left;
            temp2.right = root.right;
            return root;
        }
        else{
            insertRow(root.left, v, v, height+1);
            insertRow(root.right, v, v, height+1);
            return root;
        }
    }
}

