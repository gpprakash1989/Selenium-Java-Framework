/*Encapsulation is a process of wrapping code and data together
 * into single unit.
 * We can make class fully encapsulated by making data members of the
 * class private and use setter and getter method to set and get
 * data in it.
 * By providing only setter and getter method, you can make the
 * class read-only or write-only.
 * It provides you control over the data.*/

//A simple example of Encapsulation

package com.java.encapsulation;


class Student{
	private String name;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}

public class Encapsulation {
	public static void main(String[] args){
		Student s = new Student();
		s.setName("Kavita");
		System.out.println(s.getName());
	}

}
