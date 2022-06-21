package com.ahmadsCode.generics;


public class NumericFns2<T extends Number> {

	T num;
	
	NumericFns2( T ob ) {
		this.num = ob;
	}
	
	boolean absEqual(NumericFns2<?> ob) {
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) 
			return true;
		return false;
	}
}
