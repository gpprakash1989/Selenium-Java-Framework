/*This is an example of Hierarchical Inheritance*/

package com.java.inheritance;

class ParentAnimal{
	public void parentEat(){
		System.out.println("Eating..");
	}
}

class ChildDog extends ParentAnimal{
	public void childCry(){
		System.out.println("Crying..");
	}
}

class PuppyDog extends ParentAnimal{
	public void puppyWeep(){
		System.out.println("Weeping..");
	}
}

public class HierarchicalInheritance {
	
	public static void main(String[] args){
		ChildDog c = new ChildDog();
		PuppyDog p = new PuppyDog();
		c.parentEat();
		c.childCry();
		p.parentEat();
		p.puppyWeep();
		System.exit(0);
	}

}
