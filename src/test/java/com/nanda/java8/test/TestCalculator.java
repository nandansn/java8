package com.nanda.java8.test;

import com.nanda.java8.interfaces.Calculator;

public class TestCalculator {
	
	public static void performCalc(Calculator calc, int a, int b){
		int c = calc.calculate(a, b);
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		
		Calculator sum = (a, b) -> a +b;
		System.out.println(sum.calculate(10, 12));
		
		performCalc((a, b) -> b - a, 12, 16);
	}

}
