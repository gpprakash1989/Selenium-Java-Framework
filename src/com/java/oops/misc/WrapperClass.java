/*using wrapper class primitive can be converted to object and object
 * can be converted to primitive.
 * Wrapper classes are Integer, Boolean, Character, Byte, Short,
 * Long, Float, Double*/

//Example converting primitive to object

package com.java.oops.misc;

public class WrapperClass {
	public static void main(String[] args){
		int a=10;
		
		//Converting int into Integer
		Integer i = Integer.valueOf(a);
		//Autoboxing, now compiler will write Integer.valueof(a) internally
		Integer j = a;
		
		System.out.println(a+" "+i+" "+j);
	}

}
