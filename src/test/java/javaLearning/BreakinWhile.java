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

	}

}
