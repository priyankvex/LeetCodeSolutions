import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by priyankvex on 11/7/17.
 */
public class TreeLevelAverage {

    public static class Node{
        Node left;
        Node right;
        int value;
        Node(int n){
            value = n;
        }
    }

    public static void main(String[] args){

        Node root = new Node(2147483647);
        root.left = new Node(2147483647);
        root.right = new Node(2147483647);

        System.out.println(averageOfLevels(root));

        int i = 2147483647 + 2147483647;


    }

    static HashMap<Integer, Double> map = new HashMap<>();
    static HashMap<Integer, Double> map2 = new HashMap<>();

    public static List<Double> averageOfLevels(Node root){

        solve(root, 0);
        System.out.println(map);
        System.out.println(map2);
        List<Double> list = new LinkedList<>();

        for (int i = 0; i < map.values().size(); i++){
            double temp = map.get(i)/map2.get(i);
            list.add(temp);
        }
        return list;
    }

    public static void solve(Node root, int l){

        if (root == null){
            return;
        }

        map.putIfAbsent(l, 0d);
        map2.putIfAbsent(l, 0d);

        map.put(l, map.get(l)+root.value);
        map2.put(l, map2.get(l)+1);

        solve(root.left, l+1);
        solve(root.right, l+1);
    }
}

