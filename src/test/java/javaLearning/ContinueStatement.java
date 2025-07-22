package javaLearning;

public class ContinueStatement {

	public static void main(String[] args) {
	
		for(int i=10;i>0;i--) {
			
			if(i==3) {
				
				continue;   // It will skip this part and execute another points and condition
			}
			
			System.out.println(i);
		}
		
		
		
	}

}
