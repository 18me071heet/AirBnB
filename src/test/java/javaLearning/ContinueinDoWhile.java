package javaLearning;

public class ContinueinDoWhile {

	public static void main(String[] args) {
	
		int i=0;
		
		do {
			
			if(i%2==0) {
				
				i++;                            // User i++ before continue to avoid going to infinite loop
				continue;
			}
			
			System.out.println(i);
			i++;
			
		} while(i<=20) ;
	}

}
