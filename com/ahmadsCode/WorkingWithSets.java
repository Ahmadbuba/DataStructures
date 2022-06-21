package com.ahmadsCode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author ahmad
 * 
 * Set is a collection that contains no duplicate elements
 * Allows at most one null element
 *
 */
class Ball {
	String color;

	public Ball(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Ball [color=" + color + "]";
	}
	
}

public class WorkingWithSets {
	
	public static void main(String[] args) {
		Set<Ball> balls = new HashSet<>();
		balls.add(new Ball("blue"));
		balls.add(new Ball("blue"));
		balls.add(new Ball("yellow"));
		balls.add(new Ball("red"));
		balls.remove(new Ball("red"));
		System.out.println(balls.size());
		balls.forEach(System.out::println);
	}

	
	// override the methods below to dissallow duplicates
	// i was unable to override them here but they should ideally
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	
}
