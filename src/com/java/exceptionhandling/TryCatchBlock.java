/*Java try block must be followed by either catch or finally block.
 * You can use multiple catch block with a single try.*/

package com.java.exceptionhandling;

public class TryCatchBlock {
	public static void main(String[] args){
		try{
		int i=50/0;
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("Rest of the code..");
	}

}
