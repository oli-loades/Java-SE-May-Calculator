package com.qa.calculator;

public class Calculator {
	private Add add;
	private Subtract subtract;
	
	public Calculator() {
		add = new Add();
		subtract = new Subtract();
	}
	
	public int add(int num1, int num2) {
		return add.add(num1, num2);
	}

	public int subtract(int num1,int num2) {
		return subtract.subtract(num1, num2);
	}
	
	public int multiply(int num1, int num2) {
		return num1*num2;
	}
}
