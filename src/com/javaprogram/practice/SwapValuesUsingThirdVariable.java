package com.javaprogram.practice;

public class SwapValuesUsingThirdVariable {
	
	public static void main(String[] args){
		int a = 5, b = 7;
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a= "+a+" and "+"b= "+b);
	}

}
