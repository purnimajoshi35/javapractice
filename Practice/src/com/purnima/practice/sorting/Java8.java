package com.purnima.practice.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Java8 {
	
	public static void main(String[] args) {
		Person p1 = new Person("Atul", 22);
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Atul", 22));
		persons.add(new Person("Purnima", 0));
		persons.add(null);
		persons.add(new Person("Dwivedi", 20));
		
		List<Person> p = persons.stream()
				.filter(Objects::nonNull)
				.sorted(Comparator.comparing(Person::getName).thenComparing(Person::getAge))
				.collect(Collectors.toList());
		System.out.println(p);
	}

}

class Person{
	private String name;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
