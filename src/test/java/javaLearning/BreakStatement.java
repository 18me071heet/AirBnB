package javaLearning;

public class BreakStatement {

	public static void main(String[] args) {
	
		for(int i=2;i<=10;i+=2) {
			
			if(i==8) {
				break;
			}
			
			System.out.println(i);
		}
	}

}
