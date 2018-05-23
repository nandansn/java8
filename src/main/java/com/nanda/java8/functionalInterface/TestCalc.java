package com.nanda.java8.functionalInterface;

public class TestCalc {
	
	public static void main(String[] args) {
		
		int[] nums= {10,11,12};
		
		Calc sum = (numbers) -> {
			int s=0;
			for (int i : nums) {
				s = s +i;
			}
			return s;
			
		};
		
		System.out.println(sum.calculate(nums));
	}

}
