package com.sp;
import java.util.Scanner ;

public class arrayRotationClockwise90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	int n = sc.nextInt();
	int[][] arr = new int[m][n];
	 
	for ( int i = 0 ; i < m ; i++ )
	{
		for (int j = 0 ; j < n ; j++)
		{
		arr[i][j] = sc.nextInt();
		}
	 }
	
	// Transpose of Matrix
	
	for ( int i = 0 ; i < arr.length ; i ++ )
	{
		for (int j = 0 ; j < i ; j++)
		{
			int temp = arr[i][j];
			arr[i][j] = arr[j][i];
			arr[j][i] = temp ;
			
		}
	}
	for (int i = 0 ; i < arr.length ; i++)
	{
		for ( int j = 0 ; j < arr[0].length ; j++)
		{
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
	
	// reverse of matrix
	
	int i = 0 ;
	int j = n-1 ;
	 
	for (  i = 0 ; i < arr.length ; i++ )
	{
		for (  j = 0 ; j <= i ; j++)
		{
			
			
			while (i < m && j<n) {
			int temp = arr[i][j];
			arr[i][j]= arr[j][i];
			arr[j][i]= temp ;
			
			i++;
			j--;
			}
			
			for ( int k = 0 ; k < m ; k++)
			{
				for(int l = 0 ; l < n ; l++ )
				System.out.print(arr[k][l] + " ");
			}
			System.out.println();
		}
	}
	
	
	
	
  }

}
