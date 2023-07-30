// package com.sp;

import java.util.Scanner;


// Dt :- 30/07/2023


class prno
{
	void Prime(int x )
	{
		int count = 0 ;
		
		for( int i = 1 ; i <= x ; i++ )
		{
			if (x % i == 0)
			{
				count++;
			}
		}
		if (count == 2)
		{
			System.out.println("This is a prime number ");
		}
		else
			System.out.println("This is not a prime number ");
		
	}
	
}

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println( " Enter the number you want to prime or not");
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		
		prno p = new prno();
		p.Prime(b);
		
		
		

	}

}
