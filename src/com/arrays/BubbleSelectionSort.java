package com.arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class BubbleSelectionSort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int[] arr= {3,4,5,2,1};
		
		System.out.println("Enter the type of Sort Bubble(1) or Selection (2) sort:?");
		int n=sc.nextInt();
		
		switch(n) {
		case 1:
			bubbleSort(arr);
			break;
		case 2:
			selectionSort(arr);
			break;
		default:
			System.out.println("enter proper input");
			
		}
		
		
		System.out.println(Arrays.toString(arr));

	}

	static void selectionSort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			int last=arr.length-i-1;
			int min= getMin(arr,last);
			swap(arr,min,last);
			
		}
		
			
			
		}
		
		
		
		
		
	

	static void swap(int[] arr, int min, int end) {
		
		int temp=arr[min];
		arr[min]=arr[end];
		arr[end]=temp;
		
		
	}

	static int getMin(int[] arr, int end) {
		int min=0;
		for (int i = 1; i <=end; i++) 
		{
			if(arr[min]<arr[i])
			{
				min=i;
				
			}
		
		
		
		}
		return min;
	}
		
	

	static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			System.out.println(Arrays.toString(arr));
			
		}
		
	}

}
