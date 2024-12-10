package com.arrays;

import java.util.Arrays;

public class CyclicSort {

	public static void main(String[] args) {
		int[] arr= {4,3,1,6,5,2};
		cycleSort(arr);
		System.out.println(Arrays.toString(arr));
		

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
