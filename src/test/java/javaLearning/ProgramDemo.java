package javaLearning;

public class ProgramDemo {

	public static void main(String[] args) {

		
		// Reversing number
		
	//	int number = 45678;
	/*	int original = number;    // In this we have to store the original number for late comparison
		int reverseNumber = 0;
		
		while(number!=0) {
			

			//% operator gives the last digit
			
			int digit = number%10;                                 // Get Last Digit 
			
			reverseNumber = reverseNumber*10+digit;                         // Add Last Digit .
			
			
			// Removes last digit from number
			number = number/10;                                  // Remove the last digit after adding
			
		
			
		}
		
		//System.out.println("Original Number:"+original);
	     System.out.println("Reversed Number:"+reverseNumber);
		
		// Palindrome number example
		
		if(original==reversed) {
			
			System.out.println("This is a palindrome number :"+original);
			
		}
		
		else {
			
			System.out.println("This is not a palindrome number :");
		}
		
		*/
		
		
		 // 1: 		// Count digits in the number
		

		
		
		/*	int number = 7890013;
		int count =0;
		
			
			if(number==0) {             // If number have zero then count has one
				
				count=1;
				
			}
			 {
				while(number!=0)           // If number have not zero
				
				{                   
					number=number/10;          // Remove last digit
					count++;                    // Increase the count
				}
				 System.out.println(count);
			}
			
			
		*/
		
		 // 2: 		// Count digits in the number
		
		/*int num = 4560781;
		int countDigit =0;
		
		while(num!=0) {
			
			num = num/10;
			countDigit++;
		}
		
		System.out.println(countDigit);
		
	*/
		
		
	/*	 // 3: 		// Using String and length concept
		
		int number = 99111;
		
		int digit = String.valueOf(number).length();
		
		System.out.println(digit);
	}

*/
		
		// Count digits of Even and Odd
		
	/*	int number =234567;
		int even =0;
		int odd =0;
		
		while(number!=0) {
			
			int digit = number%10;   // Get the last digit 
			
			if(digit%2==0) {
				
	    	even++;
			
			}
			
			else {
				
				odd++;
				
			}
			
			number=number/10;         // Remove the last digit so it can move to next digit 
		}
		
		System.out.println("Count of Even Digit: "+even);
		System.out.println("Count of Odd Digit:" + odd);
		
	//	% 10 → Gets the last digit of the number.

		//% 2 → Checks if a digit is even or odd.

		// 10 → Removes the last digit so we can process the next one.
		
		
	*/
		
	
		/*
		                                     // Sum of Digit in number
		
		int number =134;
		int sum=0;
		
		while(number!=0) {
			
			int digit=number%10;
			
			sum+=digit;
			
			number=number/10;
			
		}
	
		System.out.println(sum);
		
	}
	
	*/
		
	                                              // Fibonacci Series
		
/*		int n=7;
		int first=0;
		int second=1;
		
		System.out.println(first);
		System.out.println(second);
		
	    for(int i=1;i<=n;i++) {
	    	
	    	int next = first+second;
	        first=second;
	        second=next;
	      
	        System.out.println(next);
	       
	       */
		
		
		                                 // Prime Number 
		
	/*	int number=55 ;
		
		boolean isPrimeNumber = true;
		
		if(number<=0) {
			
			isPrimeNumber= false;
		}
		
		else {
			
			for(int i=2;i<=number/2;i++) {
				
				if(number%i==0) {
					
					isPrimeNumber=false;
					break;
				}
			}
		}
		
	if(isPrimeNumber) {
		
		System.out.println("It is a prime number :"+ number);
	}
	
	else {
		
		System.out.println("It is not a prime number");
	} 
	
	*/
		
		
		                                   // Factorial 
		
		int number = 2;
		int factorial = 1;
		
		for(int i=1;i<=number;i++) {
			
			factorial=factorial*i;
		}
	
		System.out.println(factorial);
	
	    }
		
		
		
	}

