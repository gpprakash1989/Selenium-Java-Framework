/*The java string equals() method compares the two given strings based on the content of the string. If any character is not matched, it returns false. If all characters are matched, it returns true.
 * The String equals() method overrides the equals() method of Object class.*/

package com.java.string.methods;

public class EqualsExample{  
	public static void main(String args[]){  
		String s1="javatpoint";  
		String s2="javatpoint";  
		String s3="JAVATPOINT";  
		String s4="python";  
		
		System.out.println(s1.equals(s2));	//true because content and case is same  
		System.out.println(s1.equals(s3));	//false because case is not same  
		System.out.println(s1.equals(s4));	//false because content is not same
	}
}
