package com.java.polymorphism;

//Example of method overloading with type promotion if matching found
public class TypePromotion2 {
	
	public void addTwo(int a, int b){
		System.out.println("This is the first method and it is invoked.");
		System.out.println(a+b);
	}
	
	public void addTwo(long a, long b){
		System.out.println("This is the second method and it is invoked.");
	}

	public static void main(String[] args) {
		TypePromotion2 t = new TypePromotion2();
		t.addTwo(20, 10);

	}

}
