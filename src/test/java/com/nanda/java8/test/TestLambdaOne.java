package com.nanda.java8.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import org.testng.annotations.Test;

import com.nanda.java8.interfaces.DisplayInterface;
import com.nanda.java8.interfaces.IMultiArgInterface;
import com.nanda.java8.interfaces.IMultiArgInterfaceRet;
import com.nanda.java8.interfaces.IOneArgDisplay;
import com.nanda.java8.lambda.entity.Employee;
import com.nanda.java8.lambda.entity.Student;

public class TestLambdaOne {
	
	// expression with no-args

	@Test
	public void testDisplayInterface() {

		DisplayInterface dis = () -> System.out.println("nanda"); // definition

		dis.display(); // calling
	}
	
	// expression with one arg
	
	@Test
	public void testOneArgDisplayInterface() {

		IOneArgDisplay ioad = k -> System.out.println(k); // definition

		ioad.oneArgDisplay("kumar"); // calling
	}
	
	// expression with multi args
	
	@Test
	public void testMultiArgsInterface() {
		
		IMultiArgInterface calc = (a,b) -> System.out.println(a+b);
		
		calc.calc(10,12);
	}
	
	// expression with return type and variable args
	
	@Test
	public void testMultiArgsWithReturn() {
		
		IMultiArgInterfaceRet calc = (int a[]) -> a[0] * a[1] * a[2];
		
		int result = calc.calc(10,12,13);
		
		System.out.println(result);
		
		
	}
	
	// expression with multiple statements in the lambda body.
	@Test
	public void testMultipleStatmentInTheLambdaBody() {
		
		IMultiArgInterface calc = (a,b) -> {
			if(a>b)
				System.out.println("a is greater");
			else
				System.out.println("b is greater");
		};
		
		calc.calc(10, 11);
	}
	
	// expression with forEach loop
	
	@Test
	public void testForEachLoop() {
		
		ArrayList<Integer> ages = new ArrayList<>();
		Scanner reader = new Scanner(System.in);
		while(reader.hasNextInt()) {
			int age = reader.nextInt();
			ages.add(age);
		}
		
		// single statement body
		ages.forEach(a -> System.out.println(a));
		
		// multiple statement body
		ages.forEach(a -> {
			
			if(a >=18) {
				System.out.println("eligible to vote");
			} else {
				System.out.println("not eligible to vote");
			}
		});
		reader.close();
		
	}
	
	// expression with comparator
	
	@Test
	public void testLamdaWithComparator() {
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Nanda", 200));
		students.add(new Student("Anand", 100));
		students.add(new Student("Balu", 300));
		students.add(new Student("Catu", 400));
		
		Collections.sort(students, (s1,s2) -> 
		{
			return s1.getName().compareTo(s2.getName());
		});
		
		students.forEach(s -> System.out.println(s.toString()));
	}
	
	
	@Test
	public void testLamdaWithComparable() {
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(200, "Nanda"));
		employees.add(new Employee(100, "Anand"));
		employees.add(new Employee(300, "Balu"));
		employees.add(new Employee(400, "Catu"));
		
		Collections.sort(employees, (s1,s2) -> 
		{
			return s1.compareTo(s2);
		});
		
		employees.forEach(s -> System.out.println(s.toString()));
	}
	
	// expression used to filter the collection data
	
	@Test
	public void testLamdaFilteringCollectionData() {
		
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(200, "Nanda"));
		employees.add(new Employee(100, "Anand"));
		employees.add(new Employee(300, "Balu"));
		employees.add(new Employee(400, "Catu"));
		
		
		
		Stream<Employee> filteredEmployees = employees.stream().filter(e -> e.getSalary() > 150);
		
		filteredEmployees.forEach(e -> System.out.println(e.toString()));
		
		
	}
	

}
