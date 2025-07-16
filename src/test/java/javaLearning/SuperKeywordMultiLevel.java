package javaLearning;


class Bird{
	
	String behaviour = "Flying";
	
	void a()
	{
		
		System.out.println("Bird " + behaviour);
		
	}
}

class Sparrow extends Bird{
	
	
	String behaviour = "Flying";
	
	void a() {
		
		System.out.println("Sparrow " + behaviour);
		super.a();
	
	}
}

class Eagle extends Sparrow{
	
	
	String behaviour = "Sleeping ";
	
	void a() {
		
		System.out.println("Eagle " +behaviour);
		
		super.a();
	}
}


public class SuperKeywordMultiLevel {

	public static void main(String[] args) {
		
		Eagle eagle = new Eagle();
		
		eagle.a();
	}

}
