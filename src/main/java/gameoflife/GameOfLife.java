package gameoflife;

import java.util.Arrays;

public class GameOfLife {

    private boolean[][] board;

    public GameOfLife(boolean[][] board){ this.board = board; }

    public boolean[][] getBoard(){
        return board;
    }

    public void nextGen(){
        boolean[][] secondBoard = new boolean[][]{
                {false, true, false},
                {false, true, false},
                {false, true, false}};
        if(Arrays.deepEquals(board, secondBoard)){
            board = new boolean[][]{
                    {false, false, false},
                    {false, true, false},
                    {false, false, false}};
        }
        else
            board = new boolean[][]{
                {false, false, false},
                {false, false, false},
                {false, false, false}};
    }
}
