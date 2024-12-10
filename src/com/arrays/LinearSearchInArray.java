package com.arrays;

import java.util.Scanner;

public class LinearSearchInArray {

	public static void main(String[] args) {
		int[] arr=new int[6];
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the array nos");
		for (int i=0;i<arr.length;i++)
		{	
			arr[i]= sc.nextInt();
		}
		System.out.println("enter the no. to be searched");
		int in=sc.nextInt();
		
		linearSearch(arr,in);
		
		
		

	}

	static void linearSearch(int[] arr, int inp) {
		
//		for (int i = 0; i < arr.length; i++) 
//		{
//			if(arr[i]==inp)
//			{
//				System.out.println("Match found at: "+i+" array position");
//			}
//		}
		for (int i : arr) 
		{
			
							
					System.out.println(i);
				
		}
		
	}

}
