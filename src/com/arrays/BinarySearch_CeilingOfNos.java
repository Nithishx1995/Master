package com.arrays;
import java.util.Scanner;

import com.arrays.BinarySearch;

public class BinarySearch_CeilingOfNos extends BinarySearch{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {9,7,6,5,4,3,2,1};
		
		System.out.println("enter the target value:");
		int t=sc.nextInt();
		
		int c=ceilingOfNumbers(arr,t);
		System.out.println(c);
		
		

	}

	static int ceilingOfNumbers(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		int mid=0;
		
		int s=orderFind(arr);
		
		while(s == 1)
		{
		mid=start + (end-start)/2;
		if(arr[mid]<target)
		{
			start=mid;
		}
		else if(arr[mid]>target)
		{
			end=mid;
		}
		else
		{
			return arr[mid+1];
		}
		}
		while(s == 0)
		{
			mid=start + (end-start)/2;
			if(arr[mid]>target)
			{
				start=mid;
			}
			else if(arr[mid]<target)
			{
				end=mid;
			}
			else
			{
				return arr[mid-1];
			}
			}
		return 1;
	}

}
