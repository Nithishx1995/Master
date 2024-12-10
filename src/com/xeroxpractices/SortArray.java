package com.xeroxpractices;

import java.util.Arrays;
import java.util.Iterator;


public class SortArray {

	public static void main(String[] args) {
		
		String name="";
		if (name!=null)
		{
			name="Not Null";
		}
		if (name==null) 
		{
			name="Null";
		}
		
		System.out.println(name.concat("Hello"));
		
		int[] arr= {5,1,4,3,2,0};
		int[] rArr= {21,10,15,17,8};
		
		//cyclicSort(arr);
		//bubbleSort(rArr);
		
		

	}

	static void bubbleSort(int[] rArr) 
	{
		for (int i = 0; i < rArr.length-1; i++) 
		{
			if(rArr[i]<rArr[i+1])
			{
				swap(i,i+1, rArr);
			}
		}
		System.out.println(Arrays.toString(rArr));
		
		
	}

	static void cyclicSort(int[] arr) 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			int cIndex=arr[i];
			if(arr[i]!=arr[cIndex]) {
				swap(i,cIndex, arr);
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
		
		
	}

	static void swap(int i, int cIndex, int[] arr) 
	{
		int temp=arr[i];
		arr[i]=arr[cIndex];
		arr[cIndex]=temp;
		
	}

}
