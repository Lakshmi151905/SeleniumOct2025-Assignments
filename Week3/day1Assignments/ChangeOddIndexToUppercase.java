package Week3.day1Assignments;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		//input String 
		String test = "changeme";
		System.out.println("Given String: " +test);
		
		//convert the string to character Array
		char[] oddupper = test.toCharArray();
	
		
		System.out.print("OddIndexToUppercase String: ");
		//Iterate through each character of the string
		
		for (int i=0;i<oddupper.length;i++) {
			
			//find the odd index		
			if( i==0) {
				System.out.print(oddupper[i]);
			}
			
			else if((i%2)==0) {
				System.out.print(oddupper[i]);
			}
			else {
				System.out.print(Character.toUpperCase(oddupper[i]));
			}
		}
	}

}
