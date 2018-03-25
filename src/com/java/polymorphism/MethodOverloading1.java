/*If a class has multiple method with same name but different parameters
 * then it is known as method overloading. Method overloading increases
 * the readability of the program. Method can be overloaded in 2
 * ways: 1)by changing number of parameters and 2)by changing data type.
 * In java, method overloading is not possible by changing the return
 * type of the method.*/
//This is an method overloading example by changing no. of argument.

package com.java.polymorphism;

//Method overloading by changing number of argument
public class MethodOverloading1 {
	
	public static int addTwo(int a, int b){
		return a+b;
	}
	
	public static int addThree(int a, int b, int c){
		return a+b+c;
	}
	
	public static void main(String[] args){
		System.out.println(MethodOverloading1.addTwo(4, 6));
		System.out.println(MethodOverloading1.addThree(7, 5, 5));
	}

}
