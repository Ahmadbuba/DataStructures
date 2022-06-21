package com.ahmadsCode;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.LinkedList;
import java.util.Queue;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

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


//First in, first out data structure

public class WorkingWithQueues {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Person one = new Person("John", 23);
		Queue<Person> supermarket = new LinkedList<>();
		//supermarket.add(one);
		supermarket.add(new Person("Alex",21));
		supermarket.add(new Person("Mariam",18));
		supermarket.add(new Person("Ali",40));
		
		System.out.println(supermarket.size());
		System.out.println(supermarket.peek().toString());
		System.out.println(supermarket.poll().toString());
		System.out.println(supermarket.size());
		System.out.println(supermarket.peek().toString());
		System.out.println(supermarket.isEmpty());
		

	}
	
	//this works in jdk 14 upward
	//static record Person(String name, int age) {}

}
