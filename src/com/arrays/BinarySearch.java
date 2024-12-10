package com.arrays;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr= new int[6];
		char loop='y';
		Scanner sc= new Scanner(System.in);
		
		while(loop=='y')
		{
			
		System.out.println("Enter the Sorted array either in Desc or Asc:");
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();			
		}
		System.out.println("Enter the number to be searched for ");
		int n=sc.nextInt();
		
		
		int k=indexOfBinarySearch(arr,n);
		
		System.out.println("the target no. is found at the index:"+k);
		System.out.println("want to search more?(y/n):");
		loop=sc.next().charAt(0);
		}
		
		
	}

	static int indexOfBinarySearch(int[] arr, int n) 
	{
		int s= orderFind(arr);
		int start=0;
		int end=arr.length-1;
		
		while (s == 1) 
		{
				
			int mid=start+(end-start)/2;
				if(n<arr[mid])
				{
					end=mid-1;
					
				}
				else if(n>arr[mid])
				{
					start=mid+1;
					
				}
				else
					return mid;
					
		}while(s == 0) 
		{
			int mid=start+(end-start)/2;
			if(n>arr[mid])
			{
				end=mid-1;
				
			}
			else if(n<arr[mid])
			{
				start=mid+1;
				
			}
			else
				return mid;
		}
		
		return 1;
		
	}

	static int orderFind(int[] arr) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]<arr[arr.length-1])
			{
				return 1;
			}
			else
				return 0;
		}
		return -1;
		
	}
}

