import java.util.*;

/**
 * Created by priyankvex on 30/12/17.
 */
public class ReconstructQueueByHeight {

    public static void main(String[] args) {

        int[][] t = new int[][]{
                {7,0},
                {4,4},
                {7,1},
                {5,0},
                {6,1},
                {5,2}
        };

        ReconstructQueueByHeight r = new ReconstructQueueByHeight();
        t = r.reconstructQueue(t);
        System.out.println(Arrays.toString(t));
    }

    public int[][] reconstructQueue(int[][] people) {

        List<int[]> q = new LinkedList<>();
        Arrays.sort(people, (a, b) -> a[0] == b[0]?(a[1]-b[1]):-(a[0]-b[0]));
        // System.out.println(Arrays.deepToString(people));
        for (int[] p : people){
            q.add(p[1], p);
        }
        return q.toArray(new int[people.length][]);
    }
}

