package week4.day1Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementsUsingList {

	public static void main(String[] args) {
		//Input Array 
		int a[]= {1, 2, 3, 4, 10, 6, 8};
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(10);
		list1.add(6);
		list1.add(8);
		//Sort the collection
		Collections.sort(list1);
		System.out.println("The sorted list is : "+list1);
		System.out.println("Missing Numbers in the list are : ");
		//Iterate through the array to find the missing numbers
		for (int i=0;i<list1.size();i++) {

			//Condition to find the missing element
			if(!(list1.get(i)==i+1)) {
				System.out.print(i+1 +",");


			}

		}

	}

}
