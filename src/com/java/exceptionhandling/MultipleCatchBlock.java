/*Use multiple catch block when you want to perform multiple task at the
 * occurrences of different exception.
 * NOTE: At a time only one exception is occurred and at a time only
 * one catch block is executed.
 * NOTE: All catch block must be ordered from most specific to most
 * general i.e. catch for AritmeticException must come before catch
 * for Exception. */

package com.java.exceptionhandling;

public class MultipleCatchBlock {
	public static void main(String[] args){
		int a[]=new int[5];
		try{
		a[5]=20/0;
		}catch(ArithmeticException e){
			System.out.println("I am in Arithmetic Exception..");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("I am in Array Index Out Of Bounds Exception..");
		}catch(Exception e){
			System.out.println("I am in Exception..");
		}
		
		System.out.println("Rest of the code execution...");
	}

}
