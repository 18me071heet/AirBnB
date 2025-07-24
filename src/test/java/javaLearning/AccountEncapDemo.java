package javaLearning;

public class AccountEncapDemo {

	private int accid;
	private String name;
	private double amount;
	
	/*void setId(int id) {
	
	accid=id;
    }


   // If we declare same local variable name as class name

	void setAccId(int accid) {
		
		this.accid=accid;
		
		// Use this keyword if local and class variable name is same .
 	}
			
    int getId() {
	
	return accid;
    }

*/
	

	// Go to Source > Select Setter and Getter .
	
	public int getAccid() {
		
		return accid;
	}
	
	public void setAccid(int accid) {
		
		this.accid = accid;
		
	}
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public double getAmount() {
		
		return amount;
	}
	public void setAmount(double amount) {
		
		this.amount = amount;
	}
	
	
	
	
	
}
