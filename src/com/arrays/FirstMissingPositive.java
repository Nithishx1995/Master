package com.arrays;

public class FirstMissingPositive {

	public static void main(String[] args) {
		int[] arr= {1,2,0};
		
		int num=firstMissingPos(arr);
		System.out.println(num);
		

	}

	static int firstMissingPos(int[] arr) {
		
		int max=getMaxNo(arr);
		
		
			int min =1;
			while(min<=max)
			{
				for (int i = 0; i < arr.length; ) 
				{
					if(min!=arr[i])
					{
						i++;
					}
					else 
						min++;
				}
			break;
			}
		return min;
		
	}

	static int getMaxNo(int[] arr) {
		int max=0;
		for (int i = 1; i <= arr.length-1; i++) {
			if(max<arr[i])
			{
				max=arr[i];
			}
			
		}
		
		
		return max;
	}

}
