package javaLearning;


  abstract class Company{
	
	String company = "Tech"; 
	
	abstract double getSalary();
	
	void showDetails() {
		
		System.out.println("Compnay:"+ company);
		System.out.println("Salary :"+ getSalary());
		
	}
	
   }

  class Emp extends Company {
	
	double getSalary() {               // Implement abstract method in child class .
		
		return 23500.00;

	}
	
  }

    class TeamLead extends Company {
	
	double getSalary() {               // Implement abstract method in child class .
		
		return 45000.00;
	}
	
   }

    public class AbstractDemo2 {

	public static void main(String[] args) {
	
		Company comp =new Emp();               // Create object reference for Abstract class .
		comp.showDetails();
	 
	    Company comp2 = new TeamLead();      // Create object reference for Abstract class .
	    comp2.showDetails();
	    
	    TeamLead comp3 = new TeamLead();         
	    System.out.println(comp3.getSalary());
	    
	}

}
