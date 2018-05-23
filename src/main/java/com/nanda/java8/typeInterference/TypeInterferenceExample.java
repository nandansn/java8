package com.nanda.java8.typeInterference;

public class TypeInterferenceExample {
	
	public static void printStringLength(StringLengthLambda sll, String s){
		System.out.println(sll.getLength(s));
	}
	
	public static void main(String[] args) {
		
		StringLengthLambda stringLengthLambda = s -> s.length();
		
		System.out.println(stringLengthLambda.getLength("Nandakumar"));
		
		
		printStringLength(stringLengthLambda,"Java 8 Learnings");
		
		
	}
	
	
	interface StringLengthLambda{
		int getLength(String s);
	}

}
