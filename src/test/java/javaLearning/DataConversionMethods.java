package javaLearning;

public class DataConversionMethods {

	public static void main(String[] args) {
	
		
		// Conversation from String to Int
		
		String num1 = "10";
		String num2 = "20";
		
		System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));
		
		// Conversation from String to Double
		
		String num3 ="23.45";
		String num4 ="23.45";
		
		System.out.println(Double.parseDouble(num3)+Double.parseDouble(num4));
		
		
		// Conversation from String to Boolean
		
		
		String s1 ="Value";              // If enter another value than false then it will be displaying as false
		
	    System.out.println(Boolean.parseBoolean(s1));
	    
	    String s2 = "True";
	    
	    System.out.println(Boolean.parseBoolean(s2));
	    
	    
	    // Conversion of Another data type to String
	    
	    int a=10;
	    double d=10.45;
	    char c='N';
	    boolean b1 = false;
	    
	    String a1 = String.valueOf(a);
	    
	    System.out.println(a1);
	    
	    String d2 = String.valueOf(d);
	    
	    System.out.println(d2);
	    
	    String c3 = String.valueOf(c);
	    
	    System.out.println(c3);
	    
	    String b4 = String.valueOf(b1);
	    
	    System.out.println(b1);
	    
	    
	   
	    
	    
		
	}
}
