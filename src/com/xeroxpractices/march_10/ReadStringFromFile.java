package com.xeroxpractices.march_10;

import java.io.*;
import java.util.Scanner;

public class ReadStringFromFile {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String name;
		
//		try
//		{
//		BufferedWriter bw= new BufferedWriter(
//				new FileWriter("C:\\Users\\nithish.k\\OneDrive - HCL Technologies Ltd\\Desktop\\Desktop Icons\\DemoWrite.txt"));
//		System.out.println("Enter Names:");
//		for (int i = 0; i < 3; i++) {
//		
//			bw.write(name=sc.next()+"\n");
//			
//		}
//		bw.close();
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try
		{
			String fName;
			String s;
			
			System.out.println("enter name to be searched:\n");
			fName=sc.next();
			fName=fName.toLowerCase();
			
			
			BufferedReader br= new BufferedReader(
					new FileReader("C:\\Users\\nithish.k\\OneDrive - HCL Technologies Ltd\\Desktop\\Desktop Icons\\DemoWrite.txt"));
			
			while((s=br.readLine())!=null)
			{
				
				if (fName.equals(s.toLowerCase())) {
					System.out.println("Searched String was Found");
					break;
				}
			}
			br.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
