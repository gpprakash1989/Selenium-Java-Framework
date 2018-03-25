/*Throw keyword is used to explicitly throw an exception.
 * Throw keyword is used to throw custom exception.*/

package com.java.exceptionhandling;

public class ThrowKeyword {
	public static void Validate(int age){
		if(age<18){
			throw new ArithmeticException("Invalid age...");
		}else{
			System.out.println("Valid age");
		}
	}
	
	public static void main(String[] args){
		Validate(18);
		System.out.println("Rest of the code execution...");
	}

}
