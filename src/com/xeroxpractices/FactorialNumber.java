package com.xeroxpractices;

public class FactorialNumber {

	public static void main(String[] args) {
		int n=5;
		int k=factorialOfANumber(n);
		

	}

	static int factorialOfANumber(int n) 
	{
		int fact=n;
		for (int i = n; i >1; i--) 
		{
			fact=fact*(i-1);
			System.out.println(fact);
		}
		
		
		
		return fact;
	}

}
