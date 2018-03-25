package com.javaprogram.practice;

public class FindingSaddlePoint {
	
	public static boolean saddlePoint(int mat[][], int n){
		//Process all rows one by one
		for(int i=0; i<n; i++){
			int min_row = mat[i][0], col_ind = 0;
			for(int j=1; j<n; j++){
				if(min_row<mat[i][j]){
					min_row = mat[i][j];
					col_ind=j;
				}
			}
			
			//Check if minimum element of row is maximum element of column
			int k;
			for(k=0; k<n; k++)
				if(min_row>mat[k][col_ind])
					break;
					
			if(k==n){
				System.out.println("Value of Saddle Point " + min_row);
				return true;
			}
		}
		//If saddle point not found
		return false;
	}
	
	public static void main(String[] args){
	int mat[][] = {{1,2,3},
					{4,5,6},
					{7,8,9}};
	int n=3;
	if(saddlePoint(mat,n) == false)
		System.out.println("No Saddle Point");
	}
}
