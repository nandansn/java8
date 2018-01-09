package com.nanda.java8.lambda.entity;

public class Employee implements Comparable<Employee> {

	int salary;
	String name;

	public Employee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
	
	

	public int getSalary() {
		return salary;
	}



	public String getName() {
		return name;
	}



	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.salary - o.salary;
	}

}
