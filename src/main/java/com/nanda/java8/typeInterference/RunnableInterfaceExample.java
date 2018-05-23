package com.nanda.java8.typeInterference;

// Runnable has method with no-args. you can use this for the lambda that require no-args.
// lambda dont have new interface type because of backward compatability.

public class RunnableInterfaceExample {

	public static void main(String[] args) {

		Runnable runnableLambda = () -> System.out.println("Runnable");
		runnableLambda.run();
	}

}
