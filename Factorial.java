//package com.sp;
import java.util.Scanner;

// Dt :- 30/07/2023

class factorialOfNumber
{
	void factorialOf(int x)
	{
		int fact = 1;
		for ( int i = 1 ; i <= x ; i++)
		{
			
			fact = fact * i ;
			
		}
		System.out.printf( "The factorial of %d  = %d" , x, fact);
		
		
	}
}

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number you want to find the factorial");
 		Scanner sc = new Scanner(System.in);
 		int s = sc.nextInt();
		
		factorialOfNumber f = new factorialOfNumber();
		f.factorialOf(s);

	}

}
