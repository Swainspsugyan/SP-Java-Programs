package com.sp;
import java.util.Scanner;

//Dt :- 30/07/2023

class Fibonacci
{
	
	void Fs(int n)
	{
		int a = 0 , b = 1;
		int count = 0;
		
		while ( count < n )
		{
			System.out.print(a + " ");
			int c = a + b ;
			a = b ;
			b = c ;
			count++ ;
		}
		
	}
}



public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any number  ");
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		
		Fibonacci f = new Fibonacci( );
		f.Fs(x);
		

	}

}
