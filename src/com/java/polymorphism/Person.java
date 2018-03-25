/*Real example of super() keyword.*/

package com.java.polymorphism;

class Employee {
	
	int id;
	String name;
	
	Employee(int id, String name){
		//super();	Default constructor created by compiler
		this.id = id;
		this.name = name;
	}
}

public class Person extends Employee{
	float salary;
	Person(int id, String name, float salary){
		super(id, name);	//reusing parent class constructor
		this.salary = salary;
	}
	
	void display(){
		System.out.println("Empoyee Details:"+"\n"+"ID: "+id+"\n"+"Name: "+name+"\n"+"Salary: "+salary);
	}
	
	public static void main(String[] args){
		Person p = new Person(375, "Dilip", 35000f);
		p.display();
	}
}
