package com.qa.calculator;

public class Calculator {
	private iAlgorithm algorithm;

	public Calculator(iAlgorithm algorithm) {
		this.algorithm = algorithm;
	}

	public int calc(int num1, int num2) {
		return algorithm.calc(num1, num2);
	}

	public double calc(double num1, double num2) {
		return algorithm.calc(num1, num2);
	}

	public iAlgorithm getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(iAlgorithm algorithm) {
		this.algorithm = algorithm;
	}
}
