package com.nanda.java8.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JoinStrings {
	
	
	public static void main(String[] args) {
		String [] names = {"nanda","kumar"};
		System.out.println(Arrays.asList(names).stream().collect(Collectors.joining(",")));
	}

}
