package com.nanda.java8.methodreference;

import java.util.function.Consumer;

public class MethodReferenceExample {
	
	public static void printHello(){
		System.out.println("Hello");
	}
	
	public static void findNumbers(String message, Consumer<String> consumer){
		consumer.accept(message);
	}
	
	public static void isMoreThanFifty(String message){
		System.out.println("message");
	}
	
	@FunctionalInterface
	interface MyPrint{
		public void display();
	}
	
	public static void main(String[] args) {
		Thread t = new Thread(() -> printHello());
		t.start(); // this is executing the function using lambda, function pass through.
		
		Thread t2 = new Thread(MethodReferenceExample::printHello);
		t2.start(); // this is called executing method by lambda, by method reference.
		
		// method reference with arguments
		Thread t3 = new Thread(System.out::println);
		
		findNumbers("Nanda", MethodReferenceExample::isMoreThanFifty);
	}
	
	
	
	

}
