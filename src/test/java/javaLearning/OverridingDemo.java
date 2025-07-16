package javaLearning;


class School{
	
	int rollNo() {
		
	return 10;
	}
}

class First extends School{
	
	int rollNo() {
		
	return 20;
	}
}

class Second extends School{
	
	int rollNo() {
		
		return 30;
	}
}
public class OverridingDemo {

	public static void main(String[] args) {
		
		First first = new First();
		
	    System.out.println(first.rollNo());
	    
	    Second second = new Second();
	    System.out.println(second.rollNo() );
		
	}

}
