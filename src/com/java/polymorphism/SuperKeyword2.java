package com.java.polymorphism;

//super() is used to refer immediate parent class method.

class Super1{
	void eat(){
		System.out.println("Eating..");
	}
}

public class SuperKeyword2 extends Super1 {
	void sleep(){
		System.out.println("Sleeping");
	}
	
	void eat(){
		System.out.println("Eating Bread..");
	}

	void activity(){
		super.eat();
	}
	
	public static void main(String[] args){
		SuperKeyword2 s = new SuperKeyword2();
		s.sleep();
		s.eat();
		s.activity();
	}

}
