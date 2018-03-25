/*This is an example of multilevel inheritance*/

package com.java.inheritance;

class PetAnimal{
	public void eat(){
		System.out.println("Eating..");
	}
}

class ParentDog extends PetAnimal{
	public void bark(){
		System.out.println("Barking..");
	}
}

class BabyDog extends ParentDog{
	public void weep(){
		System.out.println("Weeping..");
	}
}

public class MultilevelInheritance {
	
	public static void main(String[] args){
		BabyDog d = new BabyDog();
		d.eat();
		d.bark();
		d.weep();
	}

}
