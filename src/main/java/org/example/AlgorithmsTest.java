package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AlgorithmsTest {

    @Test
    public void testReverseArray_cat() {
        Algorithms algorithms = new Algorithms();
        char[] input = {'c', 'a', 't'};
        char[] expected = {'t', 'a', 'c'};
        assertArrayEquals(expected, algorithms.reverseArray(input));
    }

    @Test
    public void testReverseArray_band() {
        Algorithms algorithms = new Algorithms();
        char[] input = {'b', 'a', 'n', 'd'};
        char[] expected = {'d', 'n', 'a', 'b'};
        assertArrayEquals(expected, algorithms.reverseArray(input));
    }
}

