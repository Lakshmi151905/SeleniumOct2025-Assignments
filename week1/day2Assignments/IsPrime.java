package week1.day2Assignments;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primeNumber = 983;
		
		if(primeNumber<=1) {
			System.out.println("The given number "+primeNumber+" is a not Prime Number!");
		
		}
		

		if(primeNumber<=2) {
			System.out.println("The given number "+primeNumber+" is a Prime Number!");
		
		}
		
		for(int i=2;i<primeNumber;i++) {
			if(primeNumber<=1) {
				System.out.println("The given number "+primeNumber+" is a not Prime Number!");
				break;
			}
			if((primeNumber%i)!=0) {
				
				if((primeNumber-1)==i) {
				System.out.println("The given number "+primeNumber+" is a Prime Number!");
		
			}
			}
			else {
				System.out.println("The given number "+primeNumber+" is a not Prime Number!");
				break;
			}
		
		
		}

	}

}

