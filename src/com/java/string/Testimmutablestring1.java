/*In java, string objects are immutable. Immutable simply means unmodifiable or unchangeable.*
 * Once string object is created its data or state can't be changed but a new string object is created.
 * If we explicitely assign it to the reference variable, it will refer to "Sachin Tendulkar" object*/

package com.java.string;

//Immutability example
public class Testimmutablestring1{  
	 public static void main(String args[]){  
	   String s="Sachin";  
	   s.concat(" Tendulkar");	//concat() method appends the string at the end  
	   System.out.println(s);	//will print Sachin because strings are immutable objects  
	 }  
	}
