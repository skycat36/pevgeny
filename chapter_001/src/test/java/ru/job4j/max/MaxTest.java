package ru.job4j.max;

import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
* Test.
*
* @author Evgeny Popov (mailto:36furious@gmail.com)
* @version $Id$
* @since 0.1
*/

public class MaxTest {
/**
* The test is checking that the first number more then second number. .
*/

	@Test
	public void whenFirstLessSecond() {
		Max maxim = new Max();
		int result = maxim.max(1, 2);
		assertThat(result, is(2));
	}
}