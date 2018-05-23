package com.nanda.java8.workouts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Java8Solution2 {

	static List<Person> persons = Arrays.asList(new Person("Nanda", "Kumar", 37), new Person("Kumar", "Nanda", 37),
			new Person("abc", "bcd", 37), new Person("abc", "ccd", 37), new Person("kbc", "ccd", 37));

	public static void main(String[] args) {

		//printConditionally(persons, p -> true);
		
		Collections.sort(persons, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		printConditionally(persons,p->true,  p -> System.out.println(p));
		
		//printConditionally(persons, p -> p.getLastName().startsWith("c") );
		
		

	}

	public static void printConditionally(List<Person> persons, Predicate<Person> condition, Consumer<Person> consumer) {

		for (Person person : persons) {
			if (condition.test(person)) {
				consumer.accept(person);
			}
		}
	}

	
}
