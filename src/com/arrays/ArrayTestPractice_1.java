package com.arrays;

import java.util.Arrays;
public class ArrayTestPractice_1 
{
	public static void main(String[] args) {
		
		int[] nums={0,1,2,2,3,0,4,2};
        int val=2;
		int k=removeElement(nums, val);
		System.out.println(k);
	        
	}
    static int removeElement(int[] nums,int val)
    {
        int c=0;
       for (int i = 0; i < nums.length; i++) 
       {
           if (nums[i]!=val) 
           {
               nums[c]=nums[i];
               c++;
           }
       }
       return c;
    }
}
//    static void swapVal(int[] nums,int val)
//    {
//    	int temp=0;
//    	for (int i = 0; i <nums.length; i++) 
//    	{
//    		
//    		if (nums[i]!=val) 
//			{
////				temp=nums[i];
////				nums[i]=nums[i+1];
////				nums[i+1]=temp;
////    			nums[i]=nums[i];
//    			System.out.println(nums[i]);
//				
//			}
//    		
//    		}
//    	
//    }

//	private static int removeElement(int[] nums, int val)
//	{
//		int count=0;
//		for (int i=0;i<nums.length;i++)
//	        {
//	            if(nums[i]==val)
//	            {
//	            	count++;
//	            }
//	        }
//		return count;
//		
//	}


//public class ArrayTestPractice_1 {
//
//	public static void main(String[] args) {
//		String name="Nithish";
//		System.out.println(Arrays.toString(name.toCharArray()));
//		
//
//	}
//int[] nums={0,2,3,4,2,5};
//class Solution 
//{
//    public int removeElement(int[] nums, int val) 
//    {
//        int[] nums={0,2,3,4,2,5};
//        int val=2;
//        int k=removeElement(nums, val);
//        sort(nums,0,k);
//    }
//    static int removeElement(int[] nums,int val)
//    {
//        for (int i=0;i<nums.length;i++)
//        {
//            if(nums[i]==
//        }
//    }
//}
//}
