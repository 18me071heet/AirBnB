package javaLearning;

public class DoWhileDemo {

	public static void main(String[] args) {


		int i=1;
		int sum=0;
		
	/*	do {
			
			if(i%2==0) {
				
			System.out.println("Even number is " + i);
			
							}
			
			i++;
			

		} while(i<=10);

*/
		
	/*	do {
			
			System.out.println(i);
			i--;
			
		}while(i>0);
	
	*/
		
		do {
		
			sum=sum+i;
			i++;
		
	}while(i<=7);
		
		System.out.println(sum);

    }
}
