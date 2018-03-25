/*Acquires all the properties and behavior of parent class. The
 * basic idea of inheritance is to create a new class based on
 * the existing class. You can use existing methods and fields of
 * parent class and add new methods and fields which useful for
 * code re-usability.
 * Inheritance represents IS-A relationship which is also known as
 * parent-child relationship.
 * Syntax: class child_class_name extends parent_class_name{//methods and fields}*/

//Simple example of IS-A relationship inheritance

package com.java.inheritance;

class Employee {
	float salary = 10000;
	}

public class Programmer extends Employee{
		int bonus = 5000;
		
	public static void main(String[] args){
		Programmer p = new Programmer();
		//float sal = p.salary;
		//int bon = p.bonus;
		System.out.println("Employee Salary is: "+p.salary);
		System.out.println("Programmer bonus is: "+p.bonus);
	}
	
}