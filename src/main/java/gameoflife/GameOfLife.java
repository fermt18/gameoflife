package gameoflife;

public class GameOfLife {

    private boolean[][] board;

    public GameOfLife(boolean[][] board){ this.board = board; }

    public boolean[][] getBoard(){
        return board;
    }

    public void nextGen(){
        boolean[][] nextBoard = new boolean[board.length][board[0].length];
        for(int posY=0; posY<board.length; posY++) {
            for (int posX = 0; posX < board[posY].length; posX++) {
                nextBoard[posY][posX] = isCellAlive(posY, posX);
            }
        }
        board = nextBoard;
    }

    private boolean isCellAlive(int posY, int posX){
        try {
            if((board[posY][posX - 1] && board[posY][posX + 1]) ||
                    (board[posY - 1][posX] && board[posY + 1][posX]))
                return true;
            else return false;
        }
        catch (ArrayIndexOutOfBoundsException e){
            return false;
        }
    }
}
