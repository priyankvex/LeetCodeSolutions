/**
 * Created by priyankvex on 13/8/17.
 */
public class HammingDistance {

    public static void main(String[] args){

        HammingDistance h = new HammingDistance();
        int n = 1;
        int m = 4;
        System.out.println(h.hammingDistance(n, m));
    }

    public int hammingDistance(int x, int y) {
        int num = x^y;
        int count = 0;
        while (num > 0){
            int temp = num%2;
            num =  num/2;
            if (temp != 0){
                count++;
            }
        }
        return count;
    }
}

