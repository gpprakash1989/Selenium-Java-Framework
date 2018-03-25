/*If a child-class has same method as in parent class, it is known
 * as method overriding. In other words, if subclass provides specific
 * implementation of the method that has been provided by one of
 * its parent class, it is known as method overriding.
 * Method overriding is used to provide specific implementation of
 * method that is already in parent class.
 * Method overriding is used for runtime polymorphism.
 * Rules: 1)method name must be same as in parent class. 2)method must have same
 * parameter as in parent class. 3)must be a IS-A relationship.*/

//This is simple method overriding example
package com.java.polymorphism;

class Bike {
	public void run(){
		System.out.println("Bike is runnnig..");
	}
}

public class MethodOverriding extends Bike{
	public void run(){
		System.out.println("Bike is runnig safely..");
	}
	
	public static void main(String[] args){
		MethodOverriding m = new MethodOverriding();
		m.run();
	}
}
