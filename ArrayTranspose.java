package com.sp;

public class ArrayTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		int[][]  arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		transpose(arr);
		
	}
	
	public static void transpose( int[][] arr) {
		for ( int i = 0 ; i < arr.length ; i++ )
		{
			for ( int j = 0 ; j < i ; j++ )
			{
				 int temp = arr[i][j];
				 arr[i][j] = arr[j][i];
				 arr[j][i] = temp;
				 
			}
			
		}
		for ( int i = 0 ; i < arr.length ; i++ )
		{
			for ( int j = 0 ; j < arr[0].length ; j++ )
			{
				 System.out.print(arr[i][j] +  " ");
			}
			System.out.println();
		}
		

	}

}
