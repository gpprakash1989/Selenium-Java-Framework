package com.javaprogram.practice;

public class SwapValuesWithoutThirdVariable {
	
	public static void main(String[] args){
		int a = 5, b = 7;
		
		a = a + b;	//12
		b = a - b;	//5
		a = a - b;	//7
		
		System.out.println("a= "+a+" and "+"b= "+b);
	}

}
