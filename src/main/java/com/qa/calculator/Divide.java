package com.qa.calculator;

public class Divide {
	
	public int divide(int num1, int num2) {
		int result;
		
		try {
			result = num1 / num2;
		} catch (ArithmeticException ae) {
			result = num1 / (num2 + 1);
		}
		
		return result;
	}
	
}
