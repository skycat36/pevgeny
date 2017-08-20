package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] array = {4, 1, 6, 2};
        int[] result = turn.back(array);
        int[] expected = {2, 6, 1, 4};
        assertThat(result, is(expected));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] array = {5, 4, 3, 2, 1};
        int[] result = turn.back(array);
        int[] expected = {1, 2, 3, 4, 5};
        assertThat(result, is(expected));
    }

}