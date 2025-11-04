package Week3.day2Assignments;

public class Elements extends Button {
	

	public static void main(String[] args) {
		//Creating Objects for Elements Class
		Elements element = new Elements();

		//Calling methods from Button Class
		element.submit();

		//Calling methods from WebElement Class -- Base Class
		element.click();
		element.SetText("Java Inheritance");

		//Creating Objects for Button Class
				Button button = new Button();
				//Calling methods from Button Class
				button.submit();

				//Calling methods from WebElement Class -- Base Class
				button.click();
				button.SetText("Java Inheritance");
				
	}

}

