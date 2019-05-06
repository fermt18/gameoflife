package gameoflife;

public class GameOfLife {

    private boolean[][] board;

    public GameOfLife(boolean[][] board){ this.board = board; }

    public boolean[][] getBoard(){
        return board;
    }

    public void nextGen(){
        boolean[][] nextBoard = new boolean[board.length][board[0].length];
        int posY = 0;
        int posX;
        for(posX=0; posX<board[posY].length; posX++) {
            nextBoard[posY][posX] = isCellAlive(posY, posX);
        }
        board = nextBoard;
    }

    private boolean isCellAlive(int posY, int posX){
        try {
            if(board[posY][posX - 1] == true && board[posY][posX + 1] == true)
                return true;
            else return false;
        }
        catch (ArrayIndexOutOfBoundsException e){
            return false;
        }
    }
}
