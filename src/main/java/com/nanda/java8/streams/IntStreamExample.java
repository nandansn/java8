package com.nanda.java8.streams;

import java.util.stream.IntStream;

public class IntStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 11;
		
		IntStream.range(0, k-1).forEach(System.out::println);

	}

}
