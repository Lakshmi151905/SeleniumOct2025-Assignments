package week1.day2Assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	fsrange = 19;
	int firstNumber =0;
	int secondNumber = 1;
	int nextNumber;
		for (int i=1;i<=fsrange;i++) {
			if(i==1) {
				System.out.print("Fibonacci Series for a given range "+fsrange+" are " +firstNumber);
				
			}
			if(i==2) {
				System.out.print("," +secondNumber);
				
			}
			if (i>=3) {
				nextNumber = firstNumber+secondNumber;
			firstNumber = secondNumber;
				secondNumber= nextNumber;
				System.out.print("," +nextNumber);
				
			}
		}

	}

}
