 package com.sp;
 import java.util.Scanner;
// import java.util.*;


public class maxArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
;
		int[] arr1 = new int [n];
		for ( int i =0 ; i<n ; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		 int max = Integer.MIN_VALUE;
		 for(int i = 0 ; i < arr1.length ; i++)
		 {
			 if ( arr1[i] < max )
			 {
				 max= arr1[i];
			 }
		 }
		 System.out.println(max);

	}

}
