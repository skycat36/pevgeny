package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 ** @author Evgeny Popov (mailto:36furious@gmail.com)
 * @version $Id$
 * @since 0.1
 * This test check that one word contain in two word.
 */

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

    @Test
    public void whenOneWordInOtherWordThenFalse() {
        Word word = new Word();
        String origin = "Досвидания";
        String sub = "иве";
        Boolean result = word.contains(word.wordInArray(origin), word.wordInArray(sub));
        Boolean expected = false;
        assertThat(result, is(expected));
    }

}
