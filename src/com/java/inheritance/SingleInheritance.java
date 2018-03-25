/*This is an example of single inheritance.*/

package com.java.inheritance;

class Animal{
	public void eat(){
		System.out.println("Eating..");
	}
}

class Dog extends Animal{
	public void bark(){
		System.out.println("Barking..");
	}
}
	class SingleInheritance{
		
	public static void main(String[] args){
		Dog d = new Dog();
		d.eat();
		d.bark();
	}
}