import java.util.*;

/**
 * Created by priyankvex on 19/5/17.
 */
public class KillProcess {

    public static void main(String[] args) {

        List<Integer> pid = new LinkedList<>();
        List<Integer> ppid = new LinkedList<>();

        pid.add(1);
        pid.add(3);
        pid.add(10);
        pid.add(5);

        ppid.add(3);
        ppid.add(0);
        ppid.add(5);
        ppid.add(3);

        System.out.println(killProcess(pid, ppid, 3));
    }

    private static List<Integer> killProcess(List<Integer> pid, List<Integer> ppid,
                                             int kill){

        Map<Integer, List<Integer>> processTree = new HashMap<>();
        for (int i = 0; i < pid.size(); i++){
            processTree.putIfAbsent(ppid.get(i), new LinkedList<>());
            processTree.get(ppid.get(i)).add(pid.get(i));
        }

        Stack<Integer> s = new Stack<>();
        List<Integer> kills = new LinkedList<>();

        s.push(kill);

        while (!s.isEmpty()){
            int temp = s.pop();
            kills.add(temp);
            if (processTree.get(temp) != null){
                for (int i : processTree.get(temp)){
                    s.push(i);
                }
            }
        }

        return kills;
    }
}

