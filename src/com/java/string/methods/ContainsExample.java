/*The java string contains() method searches the sequence of characters in this string. It returns true if sequence of char values are found in this string otherwise returns false.
 * It throws NullPointerException : if sequence is null.*/

package com.java.string.methods;

class ContainsExample{  
	public static void main(String args[]){  
		String name="what do you know about me";  
		
		System.out.println(name.contains("do you know"));  
		System.out.println(name.contains("about"));  
		System.out.println(name.contains("hello"));
	}
}
