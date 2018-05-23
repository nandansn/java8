package com.nanda.java8.workouts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Java8Solution {

	static List<Person> persons = Arrays.asList(new Person("Nanda", "Kumar", 37), new Person("Kumar", "Nanda", 37),
			new Person("abc", "bcd", 37), new Person("abc", "ccd", 37), new Person("kbc", "ccd", 37));

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonList personListPrint = persons -> {

			for (Person person : persons) {
				System.out.println(person);
			}
		};

		//personListPrint.perform(persons);

		Comparator<Person> sortAction = (p1, p2) -> {

			return p1.getLastName().length() - p2.getLastName().length();
		};

		PersonList personListSort = persons -> {

			persons.sort(sortAction);
			
			personListPrint.perform(persons);
		};
		
		Condition personNameConditon = person -> person.getLastName().startsWith("c");

		//personListSort.perform(persons);
		
		PersonList printNameStartsWithC = persons -> {
			
			for (Person person : persons) {
				
				if (personNameConditon.check(person))
					System.out.println(person);
			}
		};
		
		
		printNameStartsWithC.perform(persons);

	}

	@FunctionalInterface
	interface PersonList {

		public void perform(List<Person> persons);

	}
	
	interface Condition{
		
		public boolean check(Person p);
	}

}
