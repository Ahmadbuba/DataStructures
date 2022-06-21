package com.ahmadsCode.generics;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClassIntegers five = new MyClassIntegers(5);
		five.printStuff();
		
		MyClass<Integer> obj1 = new MyClass<>(10);
		MyClass<Double> obj2 = new MyClass<>(20.0);
		
		obj1.showType();
		obj2.showType();
		
		MyClass2<Integer,String> obj = new MyClass2<>(10,"Ahmad");
		obj.showType();
		
		
		/*
		 *  it will not accept <String> because we explicitily
		 *  mentioned that type extends Number only.
		 */
		
		NumericFns<Integer> iOb = new NumericFns<>(4);
		System.out.println(iOb.square());
		
		NumericFns2<Integer> eOb = new NumericFns2<Integer>(6);
		NumericFns2<Double> dOb = new NumericFns2<Double>(16.0);
		
		System.out.println(eOb.absEqual(dOb));
	}

}
