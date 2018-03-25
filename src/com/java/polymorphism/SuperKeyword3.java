/*Super() is used to refer immediate parent class constructor. Super()
 * is added in each class constructor by default by the compiler if
 * there is no super() like this() is added.*/

package com.java.polymorphism;

class ChildClass{
	ChildClass(){
		System.out.println("This is Child Class");
	}
}

public class SuperKeyword3 extends ChildClass{
	SuperKeyword3(){
		//super() declaration is not mandatory. If not declared compiler will automatically add super() in every class constructor
		super();
		System.out.println("This is Super Keyword3");
	}
	
	public static void main(String[] args){
		new SuperKeyword3();
	}

}
