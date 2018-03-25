package com.javaprogram.practice;

public class PrimeNumber1 {
	
	public static void main(String[] args){
		int a[]  = {3, 5, 7, 2, 34, 45, 8, 52, 67};
		int i, j, flag = 0;
		
		//Loop through the array numbers one by one
		for(i=0; i<a.length; i++){
			//Check to see if numbers are prime
			for(j=2; j<a[i]; j++){
				if(a[i] % j == 0){
					flag = 0;
					break;
				}else{
					flag = 1;
				}
			}
			if(flag == 1){
				System.out.println(i);
			}
		}
	}

}
