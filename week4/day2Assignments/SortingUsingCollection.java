package week4.day2Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		List<String> elements = new ArrayList<String>();
		elements.add("HCL");
		elements.add("Wipro");
		elements.add("Aspire Systems");
		elements.add("CTS");

		Collections.sort(elements);
		System.out.print("The contents in Reverse order is:  ");
		
		for (int i=elements.size()-1;i>=0;i--) {
			
			System.out.print(elements.get(i));
			if(i!=0) {
				System.out.print(", " );
			}
		}
	}
	

}
