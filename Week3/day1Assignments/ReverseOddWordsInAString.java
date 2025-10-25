package Week3.day1Assignments;

public class ReverseOddWordsInAString {

	public static void main(String[] args) {
		//input String
		String test = "I am a software tester";
		System.out.println("Given text: " +test);
		//Split the words
		String[] test1 = test.split(" ");

		System.out.print("Reversed Odd Words In the Given String : ");
		//Traverse through each word using for loop
		for (int i=0;i<test1.length;i++) {

			if(i==0) {
				System.out.print(test1[i]+ " ");
			}

			else if((i%2) !=0) {
				char[] charArray = test1[i].toCharArray();
				// Finding the length of the character Array
				int length = charArray.length;
				// Loop to reverse the string
				for (int j=length-1; j>=0; j--) {
					System.out.print(charArray[j]);
				}
				System.out.print(" ");
			}

			else {
				System.out.print(test1[i]+ " ");
			}
		}

	}

}
