package learnings;

public class ConstructInJava {

	int rollNum;
	int Mobile;
	String name;


	public ConstructInJava() {
		// TODO Auto-generated constructor stub
	}

	
	
	/***Covered both constructor initializing default value to variable 
	 * and how to create create anonymous object in java */ 
	
	public static void main(String[] args) {
	
		System.out.println("print the values "+new ConstructInJava().rollNum+" "+new ConstructInJava().Mobile+" "+new ConstructInJava().name);
		
	}
}
