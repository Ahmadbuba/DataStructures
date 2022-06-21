package com.ahmadsCode;

import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Person> keeper = new LinkedList<>();
		keeper.add(new Person("Alex", 21));
		keeper.add(new Person("Alexa", 15));
		keeper.addFirst(new Person("John", 23));
		
		ListIterator<Person> personListIterator = keeper.listIterator();
		
		while(personListIterator.hasNext()) {
			System.out.println(personListIterator.next());
		}
		
		System.out.println();
		while(personListIterator.hasPrevious()) {
			System.out.println(personListIterator.previous());
		}
	}

}
