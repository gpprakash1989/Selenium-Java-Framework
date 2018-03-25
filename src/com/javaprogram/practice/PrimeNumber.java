/*Programe to find a particular number as prime number*/

package com.javaprogram.practice;

public class PrimeNumber {
	
	public static void main(String[] args){
		int i, m, num = 7, flag = 1;
		
		m = num/2;
		if(num == 0 || num == 1){
			System.out.println(num+ "is not a Prime number");
		}else{
			for(i = 2; i<= m; i++){
				if(num%i == 0){
					System.out.println(num+ "is not a Prime number");
					flag = 0;
					break;
				}
			}
			if(flag == 1){
				System.out.println(num+" is a Prime number");
			}
		}
	}

}
