package Week3.day1Assignments;

import java.util.Arrays;

public class FindMissingElements {

	public static void main(String[] args) {
		//Input Array 
		int a[]= {1,4,3,2,8,6,7};

		//Sort the Array
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Missing Numbers are : ");
		//Iterate through the array to find the missing numbers
		for (int i=1;i<a.length;i++) {

			//Condition to find the missing element and break the iteration once found.
			if(a[i-1]!=i) {
				System.out.println(i);
				break;
			}

		}

	}

}
