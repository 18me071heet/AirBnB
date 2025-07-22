package javaLearning;


class Bird {
	
	String behaviour = "Flying";
	
	void a()
	{
		
		System.out.println("Bird: " + behaviour);
		
	}
}

class Sparrow extends Bird{
	
	
	String behaviour = "Eating ";
	
	void a() {
		
		System.out.println("Sparrow: " + behaviour);
		super.a();
	
	}
}

class Eagle extends Sparrow{
	
	
	String behaviour = "Sleeping ";
	
	void a() {
		
		System.out.println("Eagle: " +behaviour);
		super.a();
	}
}


public class SuperKeywordMultiLevel {

	public static void main(String[] args) {
		
		Eagle eagle = new Eagle();              // Call their parents method and their method 
		eagle.a();
		
		Sparrow sparrow = new Sparrow();        // Call their parent method and their method 
	    sparrow.a();
	}

}
