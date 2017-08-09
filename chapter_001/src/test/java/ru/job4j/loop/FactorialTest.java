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

public class FactorialTest {
	
	/* 
	* Этот тест проверяет что при постановке в функцию значения 5 мы получим 120
	*/
	@Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        
		Factorial factorial = new Factorial();
		int result = factorial.calc(5);
		int expected = 120;
		assertThat(result, is(expected));
    }

	/* 
	* Эта функция проверяет что при подстановке в функцию 0 мы получим 1
	 */
	
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
		Factorial factorial = new Factorial();
		int result = factorial.calc(0);
		int expected = 1;
		assertThat(result, is(expected));
    }

}