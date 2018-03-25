/*Try block within a try block is known as nested try block.
 * Use nested try when one part of block of code throws one error and another
 * part of block of code throws another error.*/

package com.java.exceptionhandling;

public class NestedTryBlock {
	public static void main(String[] args){
	
	try{
		//First try-catch block
		try{
			System.out.println("ArithmeticException Block:");
			int i=20/0;
		}catch(ArithmeticException e){
			System.out.println("I am AritmeticException...");
		}
		//Second try-catch block
		try{
			System.out.println("ArrayIndexOutOfBoundsException Block:");
			int a[]=new int[5];
			a[5]=40;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("I am ArrayIndexOutOfBoundsException...");
		}
	}catch(Exception e){
		System.out.println("All the Exceptions are handled");
	}
	System.out.println("Rest of the code execution...");
	}
}
