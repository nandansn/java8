package com.nanda.java8.test;

import java.util.function.Consumer;

import org.testng.annotations.Test;

import com.nanda.java8.interfaces.CalculateAndDisplay;
import com.nanda.java8.interfaces.DisplayInterface;
import com.nanda.java8.interfaces.FIDisplay;
import com.nanda.java8.interfaces.IMultiArgInterface;
import com.nanda.java8.interfaces.IOneArgDisplay;
import com.nanda.java8.interfaces.MyStaticDisplay;

public class TestMethodReferences {

	@Test
	public void testStaticMethodReference() {
		
		Consumer<String> str = System.out::println;
		
		str.accept("nanda");
	}
	
	@Test
	public void testStaticMethodReferenceUsingUserFI() {
		
		FIDisplay fiDisplay = System.out::println;
		fiDisplay.display("user defined");
		
		DisplayInterface di = MyStaticDisplay::display;
		
		di.display();
		
		IOneArgDisplay ordi = MyStaticDisplay::display;
		ordi.oneArgDisplay("nanda");
		
		IMultiArgInterface imai = CalculateAndDisplay::add;
		
		imai.calc(10, 10);
		
		
	}
	
	@Test
	public void testInstanceMethodReference() {
		
		IMultiArgInterface imai = new CalculateAndDisplay()::sub;
		
		imai.calc(10, 10);
		
		CalculateAndDisplay calc = new CalculateAndDisplay();
		
		imai = calc::sub;
		imai.calc(10, 12);
		
		
	}
	
}
