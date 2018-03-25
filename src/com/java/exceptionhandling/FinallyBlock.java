/*Java finally block is used to executed important code like closing connections, stream etc.
 * Finally block can be used to put "cleanup" code such as closing a file, closing a connection etc.
 * Finally block is always executed whether exception is handled or not.
 * If you don't handle exception, before terminating the program, JVM executes finally block(if any).
 * Rule: For each try block there can be zero or more catch blocks, but only one finally block.
 * Note: The finally block will not be executed if program exits(either by calling System.exit() or by causing a fatal error that causes the process to abort).*/

package com.java.exceptionhandling;

public class FinallyBlock {
	public static void main(String[] args){
		
		//Case 1: Example where exception doesn't occur
		/*try{
			int i=25/5;
			System.out.println(i);
		}catch(NullPointerException e){
			System.out.println(e);
		}finally{
			System.out.println("I am in finally block...");
		}
		System.out.println("Rest of the code...");*/
		
		
		
		/*//Case 2: Example where exception occur but not handled
		try{
			int i=25/0;
			System.out.println(i);
		}catch(NullPointerException e){
			System.out.println(e);
		}finally{
			System.out.println("I am in finally block...");
		}
		System.out.println("Rest of the code...");*/
		
		
		
		//Case 3: Example where exception occur and handled
				try{
					int i=25/0;
					System.out.println(i);
				}catch(ArithmeticException e){
					System.out.println(e);
				}finally{
					System.out.println("I am in finally block...");
				}
				System.out.println("Rest of the code...");
	}

}
