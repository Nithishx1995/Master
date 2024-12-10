package xeroxpractices.collectionsdemo;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		String[] names= {"Java","Nithish","Arrays"};
		
		ArrayList<String> al= new ArrayList<String>(Arrays.asList(names));
		
		System.out.println(al);
		
		al.add(2,"Car");
		Collections.sort(al);
		System.out.println("Ascending order: "+al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Descending order: "+al);
		
	}

}
