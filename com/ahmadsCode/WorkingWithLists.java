package com.ahmadsCode;

import java.util.List;
import java.util.ArrayList;

public class WorkingWithLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> colorsUnmodifiable = List.of(
					"red",
					"indigo"
				);
		
		List<String> colors = new ArrayList<>();
		colors.add("blue");
		colors.add("purple");
		colors.add("yellow");
		System.out.println(colors);
		
		// Some methods of arraylist
		System.out.println(colors.size());
		System.out.println(colors.contains("yellow"));
		System.out.println(colors.contains("pink"));
		
		// Looping through arraylist
		for ( String color: colors ) {
			System.out.println(color);
		}
	
		// Second method of looping
		colors.forEach(System.out::println);
		
		// Check type of a variable
		String str = "Sample String";
		System.out.println(str.getClass().getSimpleName());
		
		String[] arr = new String[5];
		System.out.println(arr.getClass().getSimpleName());
		
		int x = 5;
		System.out.println(((Object)x).getClass().getSimpleName());
		
		System.out.println(colors.getClass().getSimpleName());
		
		
		List mix = new ArrayList();
		mix.add("Ahmad");
		mix.add('C');
		mix.add(1);
		mix.add(5.40);
		System.out.println(mix);
		
		// Third method of looping
		for ( int i = 0; i < mix.size(); i++ ) {
			System.out.println(mix.get(i));
		}
		
		
		
		System.out.println(mix.getClass().getSimpleName());
	}

}
