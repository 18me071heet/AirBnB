package javaLearning;

public class TypeCasting {

	public static void main(String[] args) {
		
		int n =20;
		
		double d=n;    // Auto Data Conversion from Int -> Double
		
		System.out.println(d);
		
		
		double d2 =35.56;
		
		// int n2 = d2; // Auto Data Conversion not possible from Double --> Int .

     	int n2 = (int)d2;              // Manually Data Coversion - Type Casting
		System.out.println(n2);
		
		float f1 = 12F;
		int x =(int)f1;
		System.out.println(x);
		
		int g =10;
		float ff=g;
		System.out.println(ff);
		                            
		                                 // Up Casting ( low to higher conversion )
		
		
		// byte -> float , long , int , double , short
		
		// short -> int , long , float , double
				
		// char -> int , long , float , double
				
    	// int -> float , double ,long
		
	    // long -> float , double 
		
		// float -> double
		
		// double
		
		
		long l1= 445566632;
		
		short s3 = (short)l1;
		System.out.println(s3);
		
		byte b4 =(byte)l1;
		System.out.println(b4);
		
		
		

	}

}
