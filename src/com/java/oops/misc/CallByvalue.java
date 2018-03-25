/*Java support only call by value not call by reference. When a
 * method is called by passing a value to it it is known as call by
 * value.*/

//Example of call by value
package com.java.oops.misc;

public class CallByvalue {
	
	int a = 20;
	
	public void Method(int a){
		a=a+10;
	}
	
	public static void main(String[] args){
		CallByvalue obj = new CallByvalue();
		System.out.println("before change: "+obj.a);
		obj.Method(100);
		System.out.println("After change: "+obj.a);
		
	}

}
