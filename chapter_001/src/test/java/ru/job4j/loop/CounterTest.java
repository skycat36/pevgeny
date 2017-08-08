package ru.job4j.loop;

import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
* Test.
** @author Evgeny Popov (mailto:36furious@gmail.com)
* @version $Id$
* @since 0.1
*/

public class CounterTest {
	
	@Test
	public void WhenForStartDoFinishThenThrity(){
	Counter counter = new Counter();
	int result = counter.add(0, 10);
	int expected = 30;
	assertThat(result, is(expected));
	}

}