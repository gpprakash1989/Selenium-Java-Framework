/*This real example of method overriding*/

package com.java.polymorphism;
	
	class SBI extends Bank{
		int getRateOfInterest(){
			return 7;
		}
	}
	
	class ICICI extends Bank{
		int getRateOfInterest(){
			return 9;
		}
	}
	
	class AXIS extends Bank{
		int getRateOfInterest(){
			return 8;
		}
	}
		public class Bank{
			int getRateOfInterest(){
				return 0;
			}
				
	public static void main(String[] args){
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		System.out.println(s.getRateOfInterest());
		System.out.println(i.getRateOfInterest());
		System.out.println(a.getRateOfInterest());
	}
}
