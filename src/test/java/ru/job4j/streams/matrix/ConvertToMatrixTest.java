package ru.job4j.streams.matrix;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConvertToMatrixTest {

    @Test
    public void whenMatrixToList() {
        Integer[][] matrix = {
                new Integer[] {1, 2},
                new Integer[] {3, 4, 5},
                new Integer[] {6},
                new Integer[] {7, 8, 9, 10}
        };
        List<Integer> rsl = ConvertToMatrix.toMatrix(matrix);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertThat(rsl, is(expected));
    }
}