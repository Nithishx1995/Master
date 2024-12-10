package com.arrays.threadingconcept;

//class A implements Runnable
//{
//	public void run()
//	{
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Hi this is "+getClass()+ " Class");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}

//class B implements Runnable
//{
//	public void run()
//	{
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Hello this is"+getClass()+ " Class");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}

public class ThreadDemo {

	public static void main(String[] args) {
		
		Runnable aObj=()->{
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello this is 1st inner Class");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
				
		Runnable bObj=()->{
				for (int i = 0; i < 5; i++) {
					System.out.println("Hello this is 2nd inner Class");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		
		Thread t1= new Thread(aObj);
		Thread t2= new Thread(bObj);
		
		t1.start();
		t2.start();

	}

}
