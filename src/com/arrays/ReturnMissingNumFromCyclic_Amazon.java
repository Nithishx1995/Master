package com.arrays;

import java.util.Arrays;

public class ReturnMissingNumFromCyclic_Amazon {

	public static void main(String[] args) {
		int[] arr= {1,9,8,5,6,7,4,3,0};
		
		
		cycleSort(arr);
		System.out.println(Arrays.toString(arr));
		int m=0;
		for (int i = 0; i <= arr.length; i++) 
		{
			
			if(arr[i]!=m)
			{
				System.out.println("the missing no is:"+m);
			}
			else
				m++;
		}
		
		
		

	}

	static void cycleSort(int[] arr) {
		int i=0;
		int k=getMaxNo(arr);
		
		
		while(i<k)
		{
			int correctIndex= arr[i];
			if(arr[i]<arr.length && arr[i]!=arr[correctIndex])
			{
				swap(arr,i,correctIndex);
				
			}
			else
				i++;
		}
		
		
	}
	static int getMaxNo(int[] arr) {
		int max=0;
		for (int i = 1; i < arr.length-1; i++) {
			if(max<arr[i])
			{
				max=arr[i];
			}
			
		}
		
		
		return max;
	}

	static void swap(int[] arr, int i, int correctIndex) {
		int temp=arr[i];
		arr[i]=arr[correctIndex];
		arr[correctIndex]=temp;
		
	}


}
