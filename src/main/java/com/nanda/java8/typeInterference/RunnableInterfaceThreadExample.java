package com.nanda.java8.typeInterference;

public class RunnableInterfaceThreadExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Thread newThread = new Thread(() -> System.out.println("Lambda thread"));
		newThread.start();
		//newThread.run();
	}

}
