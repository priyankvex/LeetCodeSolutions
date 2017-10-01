import java.util.Arrays;

/**
 * Created by priyankvex on 1/10/17.
 */
public class TaskScheduler {

    public static void main(String[] args) {

        TaskScheduler t = new TaskScheduler();
        char[] c = new char[]{'A','A','A','B','B','B'};
        int answer = t.leastInterval(c, 2);
        System.out.println(answer);
    }

    public int leastInterval(char[] tasks, int n) {

        int[] counter = new int[26];
        for (char c : tasks){
            counter[c - 'A'] += 1;
        }
        int maxFrequency = -1;
        for (int f : counter){
            if (f > maxFrequency){
                maxFrequency = f;
            }
        }
        int maxFreqTasksCount = 0;
        for (int f : counter){
            if (f == maxFrequency){
                maxFreqTasksCount++;
            }
        }

        System.out.println(Arrays.toString(counter));
        System.out.println("max frequency : " + maxFrequency);
        System.out.println("max frequency tasks count : " + maxFreqTasksCount);

        return Math.max(tasks.length, (n+1)*(maxFrequency-1) + (maxFreqTasksCount));
    }
}

