package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	@Test
	    public void whenSabOneSubtractOneThenZero() {
        Calculator calc = new Calculator();
        calc.sub(1D, 1D);
        double result = calc.getResult();
        double expected = 0;
        assertThat(result, is(expected));
    }
	@Test
	    public void whenMulTwoMultipleThrowThenSix() {
        Calculator calc = new Calculator();
        calc.mul(2D, 3D);
        double result = calc.getResult();
        double expected = 6D;
        assertThat(result, is(expected));
    }
	@Test
	    public void whenNineDivisionThrowThenThrow() {
        Calculator calc = new Calculator();
        calc.div(9D, 3D);
        double result = calc.getResult();
        double expected = 3D;
        assertThat(result, is(expected));
    }
	
}
