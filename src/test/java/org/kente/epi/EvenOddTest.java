package org.kente.epi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EvenOddTest {

    @Test
    void givenEmptyArray_whenEvenOdd_thenReturnEmptyArray(){
        int[] expected = new int[0];
        int[] actual = EvenOdd.evenOdd(new int[0]);
        assertArrayEquals(expected, actual);
    }

    @Test
    void givenEvenIntegerArray_whenEvenOdd_thenReturnArrayInSameOrder(){
        int[] expected = {2, 4, 6, 8};
        int[] actual = EvenOdd.evenOdd(new int[]{2, 4, 6, 8});
        assertArrayEquals(expected, actual);
    }

    @Test
    void givenOddIntegerArray_whenEvenOdd_thenReturnArrayInSameOrder(){
        int[] expected = {3, 5, 7, 1};
        int[] actual = EvenOdd.evenOdd(new int[]{1, 3, 5, 7});
        assertArrayEquals(expected, actual);
    }

    @Test
    void givenEvenAndOddIntegerArray_whenEvenOdd_thenReturnArrayWithEvenNumbersAtStart(){
        int[] expected = {8, 6, 2, 1, 7, 5, 3};
        int[] actual = EvenOdd.evenOdd(new int[]{3, 5, 7, 1, 2, 6, 8});
        assertArrayEquals(expected, actual);
    }
}
