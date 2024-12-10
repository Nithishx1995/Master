package com.xeroxpractices.march_10;

class CustomException extends Exception
{
	public CustomException(int i, int j) {
		int val=i+j;
		System.out.println(val);
	}

	
}

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		int i=2;
		int j=0;
		String k=null;
		int[] arr= new int[3];
		
		CustomException cE;
		
		try {
			//ArithmeticException
			
//			if(j==0)
//			{
//				
//				throw new CustomException(i,j);
//			}
			//int l=i/j;
			
			
			
			//NullPointerException
			//k.charAt(0);
			//ArrayIndexOutOfBoundsException
			arr[4]=2;
			
			
		}catch (ArithmeticException e) {
			System.err.println("Arithmetic Exception Occured: "+e);
		}catch (NullPointerException e) {
			System.err.println("Null Pointer Exception Occured: "+e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Array Index Out Of Bounds Exception Occured: "+e);
		}catch (Exception e) {
			System.out.println("Some exception is habdled please check"); 
			e.printStackTrace();
		
		}
		

	}

}
