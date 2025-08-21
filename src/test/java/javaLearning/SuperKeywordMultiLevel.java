package javaLearning;

      
      class Bird {
      	
      	String behaviour = "Flying";
      	
      	void a()
      	{
      		
      		System.out.println("Bird: " + behaviour);
      		
      	}
      }
      
      class Sparrow extends Bird {
      	
      	
      	String behaviour = "Eating ";
      	
      	void b() {
      		
      		System.out.println("Sparrow: " + behaviour);
      		
      	
      	}
      }
      
      class Eagle extends Bird{
      	
      	
      	String behaviour = "Sleeping ";
      	
      	void c() {
      		
      		System.out.println("Eagle: " +behaviour);
      		super.a();
      	}
      }
      
      
      public class SuperKeywordMultiLevel {
      
      	public static void main(String[] args) {
      		
      		Eagle eagle = new Eagle();              // Call their parents method and their method 
      		eagle.a();
      		
      		//Sparrow sparrow = new Sparrow();        // Call their parent method and their method 
      	   // sparrow.a();
      	}
      
      }
      