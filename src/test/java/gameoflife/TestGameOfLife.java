package gameoflife;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import testdata.Board;
import testdata.BoardProvider;


public class TestGameOfLife {

    @Test
    void init_empty_board(){
        GameOfLife gameOfLife = new GameOfLife(new boolean[][]{});
        Assertions.assertArrayEquals(new boolean[][]{}, gameOfLife.getBoard());
    }

    @Test
    void init_non_empty_board(){
        boolean[][] board = {
                {false, false, false},
                {false, true, false},
                {false, false, false}};
        GameOfLife gameOfLife = new GameOfLife(board);
        Assertions.assertArrayEquals(board, gameOfLife.getBoard());
    }

    @ParameterizedTest
    @ArgumentsSource(BoardProvider.class)
    void any_live_cell_with_fewer_than_two_live_neighbours_dies_1(Board board){
        System.out.println("Initial Board:");
        printBoard(board.getInitialBoard());
        System.out.println("Next Board:");
        printBoard(board.getNextBoard());
        GameOfLife gameOfLife = new GameOfLife(board.getInitialBoard());
        gameOfLife.nextGen();
        Assertions.assertArrayEquals(board.getNextBoard(), gameOfLife.getBoard());
    }


    private void printBoard(boolean[][] board){
        for(int i=0; i<board.length; i++){
            System.out.println();
            for(int j=0; j<board[i].length; j++){
                System.out.print(board[i][j] + ", ");
            }
        }
        System.out.println();
    }
}
