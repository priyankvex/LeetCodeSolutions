public class DiameterOfTree {

    private static class Node {
        Node left;
        Node right;
        int value;
        Node(int v){
            this.value = v;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int d = findDiameter(root);

        System.out.println(d);
    }

    private static int findDiameter(Node root){
        if (root == null){
            return 0;
        }
        int lh = findHeight(root.left);
        int rh = findHeight(root.right);
        int ld = findDiameter(root.left);
        int rd = findDiameter(root.right);

        int d = Math.max(ld, rd);
        d = Math.max(d, rh+lh);
        return d;
    }

    private static int findHeight(Node root){
        if (root == null){
            return 0;
        }
        int lh = findHeight(root.left);
        int rh = findHeight(root.right);
        return Math.max(lh, rh) + 1;
    }
}

