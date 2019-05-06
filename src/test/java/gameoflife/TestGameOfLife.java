package gameoflife;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

    @Test
    void any_live_cell_with_fewer_than_two_live_neighbours_dies_1(){
        boolean[][] initial_board = {
                {false, false, false},
                {false, true, false},
                {false, false, false}};
        boolean[][] expected_board = {
                {false, false, false},
                {false, false, false},
                {false, false, false}};
        GameOfLife gameOfLife = new GameOfLife(initial_board);
        gameOfLife.nextGen();
        Assertions.assertArrayEquals(expected_board, gameOfLife.getBoard());
    }

    @Test
    void any_live_cell_with_fewer_than_two_live_neighbours_dies_2(){
        boolean[][] initial_board = {
                {false, true, false},
                {false, true, false},
                {false, false, false}};
        boolean[][] expected_board = {
                {false, false, false},
                {false, false, false},
                {false, false, false}};
        GameOfLife gameOfLife = new GameOfLife(initial_board);
        gameOfLife.nextGen();
        Assertions.assertArrayEquals(expected_board, gameOfLife.getBoard());
    }

    @Test
    void any_live_cell_with_fewer_than_two_live_neighbours_dies_3(){
        boolean[][] initial_board = {
                {false, true, false},
                {false, true, false},
                {false, true, false}};
        boolean[][] expected_board = {
                {false, false, false},
                {false, true, false},
                {false, false, false}};
        GameOfLife gameOfLife = new GameOfLife(initial_board);
        gameOfLife.nextGen();
        Assertions.assertArrayEquals(expected_board, gameOfLife.getBoard());
    }
}
