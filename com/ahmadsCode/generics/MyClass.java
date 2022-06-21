package com.ahmadsCode.generics;

public class MyClass<T> {

	T ov;
	
	MyClass( T ov ) {
		this.ov = ov;
	}
	
	void showType() {
		System.out.println(ov.getClass().getName());
	}
}
