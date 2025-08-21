package javaLearning;

public class BreakinDoWhile {

	public static void main(String[] args) {


		int i=1;
		
		do {
			
			if(i==12) {
				
		     break;
			}
			
			System.out.println(i);
			i++;
		
		}while(i<=20);

	}

}
