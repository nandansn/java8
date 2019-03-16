package com.nanda.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.nanda.java8.workouts.Person;

public class StreamsExample {
	
	static List<Person> persons = Arrays.asList(new Person("Nanda", "Kumar", 37), new Person("Kumar", "Nanda", 37),
			new Person("abc", "bcd", 37), new Person("abc", "ccd", 37), new Person("kbc", "ccd", 30));

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(persons.stream().filter(person -> person.getAge() > 35).count());
		
		IntStream numberStream = IntStream.of(1,2,3,4);
		numberStream.forEach(i -> System.out.print(i));
		
		
	}

}
