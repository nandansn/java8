package com.nanda.java8.workouts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Java7Solution {

	public static void printAllElements(List<Person> persons) {

		for (Person person : persons) {
			System.out.println(person);
		}
	}

	public static void sortNamesByLastName(List<Person> persons) {

		persons.sort(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				return o1.getLastName().length() - o2.getLastName().length();
			}
		});
		
		printAllElements(persons);
	}
	
	public static void printLastNameBeginingWithC(List<Person> persons){
		
		for (Person person : persons) {
			
			if (person.getLastName().startsWith("c")){
				System.out.println(person);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(new Person("Nanda","Kumar",37),
				new Person("Kumar","Nanda",37),
				new Person("abc","bcd",37),
				new Person("abc","ccd",37),
				new Person("abc","ccd",37)
				);
		
		//printAllElements(persons);
		//sortNamesByLastName(persons);
		printLastNameBeginingWithC(persons);
	}

}
