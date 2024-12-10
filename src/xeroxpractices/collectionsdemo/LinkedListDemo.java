package xeroxpractices.collectionsdemo;

import java.util.*;
//to add and check if elements are available in list
public class LinkedListDemo {

	public static void main(String[] args) {
		
		int ip;
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the nos to be added:");
		for (int i = 0; i < 4; i++) {
			list.add(ip=sc.nextInt());
			
		}
		
		System.out.println(list);
		
		boolean check=list.contains(3);
		System.out.println("if no. is present?: "+check);
	}

}
