package com.qa.calculator;

public class Calculator {
	private  iAlgorithm  algorithm;

	public Calculator(iAlgorithm  algorithm) {
		this.algorithm = algorithm;
	}

	public int add(int num1, int num2) {
		return algorithm.calc(num1, num2);
	}

	public int subtract(int num1, int num2) {
		return algorithm.calc(num1, num2);
	}

	public int multiply(int num1, int num2) {
		return algorithm.calc(num1, num2);
	}

	public int divide(int num1, int num2) {
		return algorithm.calc(num1, num2);
	}
}
