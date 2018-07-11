package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator calc = new Calculator();
		int actualValue = calc.add(2, 2);
		Assert.assertEquals(4, actualValue);
	}
	
	@Test
	public void subtractTest() {
		Calculator calc = new Calculator();
		Assert.assertEquals(4, calc.subtract(10,6));
		Assert.assertEquals(-6, calc.subtract(2,8));
	}
	
	@Test
	public void multiplyTest() {
		Calculator calc = new Calculator();
		Assert.assertEquals(60, calc.multiply(10,6));
		Assert.assertEquals(0, calc.multiply(10,0));	
	}
	
	@Test
	public void divideTest() {
		Calculator calc = new Calculator();
		Assert.assertEquals(2, calc.divide(10,5));
		Assert.assertEquals(10, calc.divide(10,0));	
		Assert.assertEquals(0, calc.divide(5,10));	
	}

}
