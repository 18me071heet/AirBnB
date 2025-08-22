package javaLearning;

public class ContinueinWhile {

	public static void main(String[] args) {
	
		int i=1;
		
	/*	while(i<=9) {
			
			if(i==4) {
				
			    i++;                    // 	Prevent infinite loop when skipping printing
				continue;
				
			}
			
			System.out.println(i);
			i++;                       // 	Normal loop progression for other values
		} 
*/
		
		while(i<=12) {
			
			if(i%2==0) {
				
				i++;
				continue;
			}
			
			System.out.println(i);
			i++;
		}
	}
	
	

}
