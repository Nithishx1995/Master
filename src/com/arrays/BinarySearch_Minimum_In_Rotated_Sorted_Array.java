package com.arrays;
import com.arrays.BinarySearch;

public class BinarySearch_Minimum_In_Rotated_Sorted_Array {

	public static void main(String[] args) {
		int[] arr= {3,4,5,1,2};
		int min=minOfSortedArray(arr);
		
		

	}

	static int minOfSortedArray(int[] nums) {
		int min = nums[0];
		 for (int i = 0; i < nums.length-1; i++) 
		 {
			while(nums[i]>nums[i+1])
			{
				min=nums[i+1];
				break;
			}
		 }	
		 System.out.println(min);
		return min;
	}

}
