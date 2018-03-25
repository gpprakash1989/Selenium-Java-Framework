package com.java.polymorphism;

//Method overloading by changing data type of the argument
public class MethodOverloading2 {
	
	public static float addTwo(float a, float b){
		return a+b;
	}
	
	public static double addThree(double a, double b, double c){
		return a+b+c;
	}

	public static void main(String[] args) {
		System.out.println(MethodOverloading2.addTwo(2.5f, 3.5f));
		System.out.println(MethodOverloading2.addThree(242000, 443220, 2324));

	}

}
