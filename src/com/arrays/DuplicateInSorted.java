package com.arrays;

import java.util.Arrays;

public class DuplicateInSorted {

	public static void main(String[] args) {
		
		int[] arr= {1,1,2};
		int dup=arr.length-1;
		cycleSort(arr);
		System.out.println(Arrays.toString(arr));
		if(arr[dup]==arr[arr[dup-1]])
		{
			System.out.println(arr[dup]);
		}

	}
	static void cycleSort(int[] arr) {
		int i=0;
		
		while(i<arr.length)
		{
			int correctIndex= arr[i]-1;
			if(arr[i]!=arr[correctIndex])
			{
				swap(arr,i,correctIndex);
				
			}
			else
				i++;
		}
		
		
		
	}

	static void swap(int[] arr, int i, int correctIndex) {
		int temp=arr[i];
		arr[i]=arr[correctIndex];
		arr[correctIndex]=temp;
		
	}

}
