package com.ahmadsCode;

import java.util.Arrays;

public class TheArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] colors = new String[5];
		colors[0] = "purple";
		colors[1] = "blue";
		
		
		System.out.println(Arrays.toString(colors));
		
		System.out.println(colors[0]);
		System.out.println(colors[1]);
		System.out.println(colors[2]);
		System.out.println(colors[3]);
		System.out.println(colors[4]);
		
		
		colors[2] = "yellow";
		
		System.out.println(Arrays.toString(colors));
		
		int[] numbers = {100, 200};
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		for(int i = colors.length - 1; i >= 0; i--) {
			System.out.println(colors[i]);
		}
		
		System.out.println(colors.length);
		
		System.out.println(Arrays.toString(numbers));
		
		
		// Enhanced For Loops For Array
		
		for( String color : colors ) {
			System.out.println(color);
		}
		
		// Using Streams
		Arrays.stream(numbers).forEach(System.out::println);
	}

}
