package com.ahmadsCode.generics;

import java.util.HashMap;

public class MyClass2<T,V> {
	T ob;
	V ob2;
	
	HashMap<T,V> map = new HashMap<>();
	
	MyClass2(T ob, V ob2) {
		this.ob = ob;
		this.ob2 = ob2;
	}
	
	void showType() {
		System.out.println(ob.getClass().getSimpleName());
		System.out.println(ob2.getClass().getSimpleName());
	}

}
