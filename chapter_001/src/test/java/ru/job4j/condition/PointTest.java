package ru.job4j.condition;

import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
* Test.
** @author Evgeny Popov (mailto:36furious@gmail.com)
* @version $Id$
* @since 0.1
*/

public class PointTest {
/**
* If the point is location on this function then return 1, otherwise 0.
*/

	@Test
	public void whenPointOnFunctionThenOne() {
		Point point = new Point(1, 1);
		boolean result = point.is(1, 0);
		boolean expected = true;
		assertThat(result, is(expected));
	}
}