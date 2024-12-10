package com.arrays;
import com.arrays.BinarySearch;

public class Bitonic_MountainNumberOfArray extends BinarySearch {

	public static void main(String[] args) {
		int[] arr= {3,5,3,2,0};
		
		int k=bitonicNumber(arr);
		System.out.println(k);
		
		

	}

	static int bitonicNumber(int[] arr) {
		
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int mid=start + (end-start)/2;
			if(mid>0 && arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1] )
			{
				return mid;
			}else if( mid>0 &&arr[mid]<arr[mid+1] && arr[mid-1]<arr[mid])
			{
				start=mid+1;
			}else if(mid>0 && arr[mid]>arr[mid+1] && arr[mid-1]>arr[mid] && mid>0)
			{
				end=mid-1;
			}
			else 
				return mid;
				
		}
		
			
			
		
		return -1;
	}

}
