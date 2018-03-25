/*Printing Fibonacci Series without recursion*/

package com.javaprogram.practice;

public class FibonacciWithoutRecursion {
	public static void main(String[] args){
		int n1 = 0, n2 = 1, n3, i;
		int max = 10;
		
		System.out.println(n1+"\n"+n2);
		
		for(i=2; i<max; ++i){
			n3 = n1+n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;			
		}
	}

}
