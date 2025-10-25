package Week3.day1Assignments;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		//input String
		String text = "We learn Java basics as part of java sessions in java week1";
		System.out.println("Given String: " + text);
		//Initialize the count variable
		int count =0;
		//Split the words with space as delimiter
		String[] text1 = text.split(" ");


		//Iterate to compare the words to find the duplicates
		for (int i=0;i<text1.length;i++) {
			for (int j=0;j<text1.length;j++) {

				//Condition to compare the text is duplicate in the given string and if condition met increment the counter
				if((text1[i].equals(text1[j])) && (i!=j)) {

					text1[i]= text1[i].replace(text1[i],"  ");
					text1[j]=  text1[j].replace(text1[j],"  ");

					count++;
				}
			}
		}
		//Condition to print the removed Duplicate words in the given string if the counter value is greater than 1
		if(count>=1) {
			System.out.print("Input String after removing the Duplicate words: ");
			for (int k=0;k<text1.length;k++) {

				System.out.print(text1[k]+ " ");
			}
		}
	}

}
