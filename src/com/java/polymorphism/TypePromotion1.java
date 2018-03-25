/*One data type is promoted to another data type if no matching
 * data type is found. If matching data type is there then it is not
 * promoted.*/

package com.java.polymorphism;

//Example of method overloading with type promotion if matching is not found
public class TypePromotion1 {
	
	public void addTwo(int a, long b){
		System.out.println(a+b);
	}
	
	public void addThree(int a, int b, int c){
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args){
		TypePromotion1 t = new TypePromotion1();
		t.addTwo(2, 6);
		t.addThree(3, 7, 6);
	}

}
