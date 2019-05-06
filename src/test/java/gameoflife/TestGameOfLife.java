package gameoflife;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGameOfLife {

    @Test
    void init_empty_board(){
        GameOfLife gameOfLife = new GameOfLife(new boolean[][]{});
        Assertions.assertArrayEquals(new boolean[][]{}, gameOfLife.getBoard());
    }
}
