package com.xeroxpractices;

import java.util.Iterator;

public class FibonacciWithRecursion {

	public static void main(String[] args) {
		
		int n=5;
		fib(n);
	}

	static void fib(int n) 
	{
		int i = 0;
		int j = 1;
		int sum = 1;

		for (int k = 1; k <= n; k++) {
			System.out.print(i + ", ");

            i = j;
			j = sum;
			sum = i + j;
	}

	}
}
