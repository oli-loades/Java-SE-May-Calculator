package com.qa.calculator;

public class Calculator {
	private Add add;
	private Subtract subtract;
	private Multiply multiply;
	private Divide divide;

	public Calculator() {
		add = new Add();
		subtract = new Subtract();
		multiply = new Multiply();
		divide = new Divide();
	}

	public int add(int num1, int num2) {
		return add.add(num1, num2);
	}

	public int subtract(int num1, int num2) {
		return subtract.subtract(num1, num2);
	}

	public int multiply(int num1, int num2) {
		return multiply.multiply(num1, num2);
	}

	public int divide(int num1, int num2) {
		return divide.divide(num1, num2);
	}
}
