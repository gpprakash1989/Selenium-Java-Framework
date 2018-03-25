//Converting object into wrapper

package com.java.oops.misc;

public class WrapperClass2 {
	public static void main(String[] args){
		//Creating object i of wrapper class Integer
		Integer i = new Integer(10);
		//Converting Integer to int
		int a = i.intValue();
		//unboxing, now compiler will write i.intValue() internally
		int j = a;
		
		System.out.println(i+" "+a+" "+j);
	}

}
