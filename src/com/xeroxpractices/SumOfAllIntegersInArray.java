package com.xeroxpractices;

public class SumOfAllIntegersInArray {

	public static void main(String[] args) {
		int[] arr= {1,2,5,6,9};
		int sum=sumOfIntegers(arr);
		System.out.printf("sum of Integers in the array is: %d",sum);
		

	}

	static int sumOfIntegers(int[] arr) 
	{
		int sum=0;
		for (int i = 0; i < arr.length; i++) 
		{
			sum+=arr[i];
		}
		
		return sum;
	}

}
