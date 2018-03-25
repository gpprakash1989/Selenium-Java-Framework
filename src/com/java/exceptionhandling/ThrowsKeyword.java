/*Throws keyword is used to declare exception. Mainly used to handle checked exception.
 * If there exists and unchecked exception then it is programmer's fault that he is not performing check up before using the code.
 * Checked exception has to propagated (forward in call stack).
 * Unchecked exceptions are be default propagated (forwarded in call stack).
 * RULE: If you are calling a method that declares an exception, you must either caught or declare the exception.*/

package com.java.exceptionhandling;

import java.io.IOException;

public class ThrowsKeyword {
	void Method1() throws IOException{
		throw new IOException("Device error");
	}
	
	void Method2() throws IOException{
		Method1();
	}
	
	void Method3(){
		try{
		Method2();
		}catch(Exception e){
			System.out.println("Exception handled in Method3");
		}
	}
	
	public static void main(String[] args){
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.Method3();
		System.out.println("Rest of the code execution...");
	}

}
