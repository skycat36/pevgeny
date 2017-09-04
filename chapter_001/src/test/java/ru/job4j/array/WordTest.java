package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WordTest {
    @Test
    public void whenOneWordInOtherWordThenTrue() {
        Word word = new Word();
        String origin = "Привет";
        String sub = "иве";
        Boolean result = word.contains(word.wordInArray(origin), word.wordInArray(sub));
        Boolean expected = true;
        assertThat(result, is(expected));
    }


}
