package com.nanda.java8.test;

import org.testng.annotations.Test;

import com.nanda.java8.interfaces.DisplayInterface;
import com.nanda.java8.interfaces.IMultiArgInterface;
import com.nanda.java8.interfaces.IMultiArgInterfaceRet;
import com.nanda.java8.interfaces.IOneArgDisplay;

public class TestLambdaOne {
	
	// expression with no-args

	@Test
	public void testDisplayInterface() {

		DisplayInterface dis = () -> System.out.println("nanda"); // definition

		dis.display(); // calling
	}
	
	// expression with one arg
	
	@Test
	public void testOneArgDisplayInterface() {

		IOneArgDisplay ioad = k -> System.out.println(k); // definition

		ioad.oneArgDisplay("kumar"); // calling
	}
	
	// expression with multi args
	
	@Test
	public void testMultiArgsInterface() {
		
		IMultiArgInterface calc = (a,b) -> System.out.println(a+b);
		
		calc.calc(10,12);
	}
	
	// expression with return type and variable args
	
	@Test
	public void testMultiArgsWithReturn() {
		
		IMultiArgInterfaceRet calc = (int a[]) -> a[0] * a[1] * a[2];
		
		int result = calc.calc(10,12,13);
		
		System.out.println(result);
		
		
	}
	
	// expression with multiple statements in the lambda body.
	@Test
	public void testMultipleStatmentInTheLambdaBody() {
		
		IMultiArgInterface calc = (a,b) -> {
			if(a>b)
				System.out.println("a is greater");
			else
				System.out.println("b is greater");
		};
		
		calc.calc(10, 11);
	}
	
	

}
