package javaLearning;

public class BreakinWhile {

	public static void main(String[] args) {
		
		int i=1;
	
		while(i<=12) {
			
			if(i==9) {
				
				break;
				
			}
			
			
			System.out.println(i);   	//You print the current value, then increment
			i++;
		}

		
		int number=390134;
		int sum=0;
		
		while(number!=0) {
			
			int digit=number%10;
			sum=sum+digit;
			number=number/10;
		}
	
		System.out.println("The sum of given number is:"+sum);
	}

}
