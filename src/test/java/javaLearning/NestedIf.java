package javaLearning;

public class NestedIf {

	public static void main(String[] args) {
	
		
		String bank ="HDFC";
		String name ="John";
		int otp =121;
		
		if(bank.equals("HDFC")) {
			
			if(name.equals("John") && otp==122) {
				
				System.out.println("Access granted");
				
			}
			
			else {
				
				System.out.println("Invalid Details");
			}
		}
		
		else {
			
			System.out.println("No Bank is found");
		}
		
		
	}

}
