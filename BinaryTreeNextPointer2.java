/**
 * Created by priyankvex on 18/5/17.
 */
public class BinaryTreeNextRightPoiinter2 {

    private static class Node {
        Node left;
        Node right;
        Node next;
        int value;
        Node (int n){
            value = n;
        }
    }

    public static void main(String[] args) {


    }

    private static void connect(Node root){
        if (root == null){
            return;
        }
        Node nextHead = null;
        while (root != null){

            if (root.left != null){{
                if (nextHead == null){
                    nextHead = root.left;
                }
                Node temp = root;
                if (temp.right != null){
                    root.left.next = temp.right;
                }
                else{
                    temp = temp.next;
                    while (temp != null){
                        if (temp.left != null){
                            root.left.next = temp.left;
                            break;
                        }
                        else if (temp.right != null){
                            root.left.next = temp.right;
                            break;
                        }
                        temp = temp.next;
                    }
                }

            }}

            if (root.right != null){
                if (nextHead == null){
                    nextHead = root.right;
                }
                Node temp = root;
                temp = temp.next;
                while (temp != null){
                    if (temp.left != null){
                        root.right.next = temp.left;
                        break;
                    }
                    else if (temp.right != null){
                        root.right.next = temp.right;
                        break;
                    }
                    temp = temp.next;
                }
            }

            root = root.next;
        }

        connect(nextHead);
    }
}

