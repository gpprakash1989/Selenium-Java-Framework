/*Super keyword is a reference variable which is used to refer immediate
 * parent class object. Super Keyword is used to refer 1)immediate
 * parent class instance variable 2)used to invoke immediate parent class
 * method 3)used to invoke immediate parent class constructor.*/

//1) Super() is used to refer immediate parent class instance varibale
package com.java.polymorphism;

class SubClass {
	
	String name = "Dilip";
}

public class SuperKeyword1 extends SubClass{
	String name = "Kavita";
	
	void displayName(){
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public static void main(String[] args){
		SuperKeyword1 s = new SuperKeyword1();
		s.displayName();
	}
}
