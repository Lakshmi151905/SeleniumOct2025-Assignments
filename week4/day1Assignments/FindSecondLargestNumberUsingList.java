package week4.day1Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumberUsingList {

	public static void main(String[] args) {
		int a[]=  {3, 2, 11, 4, 6, 7};
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);
		
		System.out.println("The List contents are : "+list1);
		
		Collections.sort(list1);
		
		System.out.println("The Sorted List contents are : "+list1);
		
		
		int size = list1.size();
		
		System.out.println("The Second Largest Number in the list is "+list1.get(size-2));
		

	}  

}
