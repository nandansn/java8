package com.nanda.java8.interfaces;

public class Greeter {
	
	public void perform(Greet greet){
		greet.greeting();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greet greet = new HelloWorldGreeting();
		
		Greeter greeter = new Greeter();
		greeter.perform(greet);
		
		greeter.perform(() -> System.out.println("nanda"));
		

	}

}
