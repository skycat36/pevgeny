package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MergeArrayTest {
    @Test
    public void whenOneArrayMergeWithTwoArrayThenThreeSortedArray() {
        MergeArray mergeArray = new MergeArray();
        int[] arrayOne = {1, 4, 5, 9, 11};
        int[] arrayTwo = {0, 3, 7, 8, 10, 12};
        int[] result = mergeArray.merge(arrayOne, arrayTwo);
        int[] expected = {0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 12};
        assertThat(result, is(expected));

    }

}

