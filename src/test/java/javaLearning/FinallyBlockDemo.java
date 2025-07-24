package javaLearning;

import java.util.Scanner;

public class FinallyBlockDemo {

	public static void main(String[] args) throws InterruptedException {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		
		int number = sc.nextInt();
		
		Thread.sleep(2000);
		
		try {
			
			System.out.println("Total:"+ 10/number);
		}
		
		catch( ArithmeticException e) {
			
			System.out.println("Invalid Data Provided");
			
		}
		
		finally {
			
			System.out.println("Finally Block is Executed");
		}
		
	}

}
