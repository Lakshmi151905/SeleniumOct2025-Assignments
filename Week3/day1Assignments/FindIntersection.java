package Week3.day1Assignments;

public class FindIntersection {

	public static void main(String[] args) {
		//Input Arrays
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
	System.out.println("Matching Elements are : ");
		//for loop - to iterate to find the match
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				
				//conditional statement to find the match (Comparing both the arrays)
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}

	}

}
