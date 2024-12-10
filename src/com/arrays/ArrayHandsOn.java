package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHandsOn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr= new int[6];
		System.out.println("enter nos in the row");
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
		
		swap(arr,1,3);
		
		System.out.println(Arrays.toString(arr));
	}

	static void swap(int[] arr, int s, int e) 
	{
		
		int temp = arr[s];
		arr[s]=arr[e];
		arr[e]=temp;
	}

}
