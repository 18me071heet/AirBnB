package javaLearning;

public class IfElseDemo {

	public static void main(String[] args) {
	
	//	int number = 10;
			
	/*	if(number >0) {
			
			System.out.println("The number is positive");
		}
		
		else if(number <0) {
			
			System.out.println("This number is negative");
		}
		
		else {
			
			System.out.println("Zero");
		}

	} */
		
		
		
	/*	
		if(number%2==0) {
			
			System.out.println("It is a Even number");
		}
		
		else {
			
			System.out.println("It is a Odd number");
		}
	}
	
	*/
		
		int a=40,b=30,c=30;
		
		if(a>b && a>c) {
			
			System.out.println("A is the largest");
		}
		
		else if(b>a && b>c) {
			
			System.out.println("B is the largest");
		}
		
		else if (c>a && c>b) {
			
			System.out.println("C is the largest");
		}
		
		else {
			
			System.out.println("A, B & C are equal");
		}

	}
}
