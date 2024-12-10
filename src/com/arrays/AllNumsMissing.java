package com.arrays;
import java.util.Arrays;

import com.arrays.CyclicSort;

public class AllNumsMissing extends CyclicSort {

	public static void main(String[] args) {
		int[] arr= {4,3,5,7,8,2,3,1};
		int j = 0;
		int[] nums=new int[arr.length];
		cycleSort(arr);
		System.out.println(Arrays.toString(arr));
		for (int i = 1; i <=arr.length; i++) {
			if(arr[i-1]!=i)
			{
				
				
					nums[j]=i;
					j++;
							
				
			}
			
		}
		System.out.println(Arrays.toString(nums));
		
		

	}

}
