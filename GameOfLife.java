import java.util.ArrayList;
import java.util.List;

/**
 * Created by priyankvex on 19/10/17.
 */
public class GameOfLife {

    public static void main(String[] args) {

        GameOfLife g = new GameOfLife();
        int[][] temp = new int[][]{
                {0}
        };
        g.gameOfLife(temp);
    }

    private class Pair{
        int i, j;

        Pair(int i, int j){
            this.i = i;
            this.j = j;
        }
    }

    public void gameOfLife(int[][] board) {

        List<Pair> ones = new ArrayList<>();
        List<Pair> zeros = new ArrayList<>();

        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                // get all the 8 neighbours
                int[] n = getNeightbours(board, i, j);
                // apply the rules
                int newValue = applyRules(n, board[i][j]);
                // put the value in the appropriate list
                if (newValue == 1){
                    ones.add(new Pair(i, j));
                }
                if (newValue == 0){
                    zeros.add(new Pair(i, j));
                }
            }
        }

        // update the board to get the new state
        updateBoard(board, ones, zeros);

    }

    private int[] getNeightbours(int[][] board, int i, int j){
        int[] n = new int[8];
        try{
            n[0] = board[i-1][j-1];
        }
        catch (ArrayIndexOutOfBoundsException e){
            n[0] = -1;
        }

        try{
            n[1] = board[i][j-1];
        }
        catch (ArrayIndexOutOfBoundsException e){
            n[1] = -1;
        }

        try{
            n[2] = board[i+1][j-1];
        }
        catch (ArrayIndexOutOfBoundsException e){
            n[2] = -1;
        }

        try{
            n[3] = board[i+1][j];
        }
        catch (ArrayIndexOutOfBoundsException e){
            n[3] = -1;
        }

        try{
            n[4] = board[i+1][j+1];
        }
        catch (ArrayIndexOutOfBoundsException e){
            n[4] = -1;
        }

        try{
            n[5] = board[i][j+1];
        }
        catch (ArrayIndexOutOfBoundsException e){
            n[5] = -1;
        }

        try{
            n[6] = board[i-1][j+1];
        }
        catch (ArrayIndexOutOfBoundsException e){
            n[6] = -1;
        }

        try{
            n[7] = board[i-1][j];
        }
        catch (ArrayIndexOutOfBoundsException e){
            n[7] = -1;
        }

        return n;
    }

    private int applyRules(int[] neighbours, int value){
        int count1 = 0;
        int newValue = 0;
        for (int i : neighbours){
            if (i == 1){
                count1++;
            }
        }
        if (value == 1){
            if (count1 < 2){
                newValue = 0;
            }
            else if (count1 == 2 || count1 == 3){
                newValue = 1;
            }
            else if (count1 > 3){
                newValue = 0;
            }
        }
        else if (value == 0){
            if (count1 == 3){
                newValue = 1;
            }
        }

        return newValue;
    }

    private void updateBoard(int[][] board, List<Pair> ones, List<Pair> zeros){

        for (Pair p : ones){
            board[p.i][p.j] = 1;
        }
        for (Pair p : zeros){
            board[p.i][p.j] = 0;
        }
    }
}


