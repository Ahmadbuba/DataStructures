package com.ahmadsCode;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Person> rec = new HashMap<>();
		rec.put(1, new Person("Ahmad",50));
		rec.put(2, new Person("Yusuf",40));
		rec.put(3, new Person("Abdul",45));
		System.out.println(rec);
		System.out.println(rec.size());
		System.out.println(rec.get(1));
		System.out.println(rec.containsKey(4));
		System.out.println(rec.keySet());
		System.out.println(rec.entrySet());
		System.out.println();
		rec.remove(3);
		
		rec.entrySet().forEach(System.out::println);
		System.out.println();
		rec.entrySet()
					.forEach(x -> System.out.println(x.getKey()+ " "
							+ x.getValue()));
		
		System.out.println();
		
		rec.forEach((key, person) -> {
			System.out.println(key + " - " + person);
		});
		
		System.out.println();
		System.out.println(rec.get(3));
		System.out.println();
		System.out.println(rec.getOrDefault(3, new Person("defaultPerson", 100)));
		System.out.println();
		System.out.println(rec.values());

	}

}
