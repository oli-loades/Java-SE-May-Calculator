package com.qa.calculator;

public class Divide implements iAlgorithm{
	
	public int calc(int num1, int num2) {
		int result;
		
		try {
			result = num1 / num2;
		} catch (ArithmeticException ae) {
			result = num1 / (num2 + 1);
		}
		
		return result;
	}

	public double calc(double num1, double num2) {
		double result;
		
		try {
			result = num1 / num2;
		} catch (ArithmeticException ae) {
			result = num1 / (num2 + 1);
		}
		
		return result;
	}
	
}
