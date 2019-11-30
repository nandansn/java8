package com.nanda.java8.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class StreamsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<String> names = Arrays.asList("nanda","kumar","sanmathi","nivrithi","valar");
		names.stream().sorted().forEach(System.out::println);
		

	}

}
