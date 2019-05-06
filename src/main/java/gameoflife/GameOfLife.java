package gameoflife;

public class GameOfLife {

    private boolean[][] board;

    public GameOfLife(boolean[][] board){ this.board = board; }

    public boolean[][] getBoard(){
        return board;
    }
}
