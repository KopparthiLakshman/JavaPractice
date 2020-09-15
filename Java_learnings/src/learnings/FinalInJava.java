package learnings;

public class FinalInJava {

	final String STR ;
	static final int counter;
	static {
		counter = 1000;
	}
	
	public static void main(String[] args) {
		
		finalMethod(1000);
	}
	
	static void finalMethod(final int sal) {
		
		/**  <sal>  is final variable value cannot be changes once assigned  */
//		sal = sal +2;
	}
	
	private FinalInJava() {
		STR = "insideConstructor for final variable";
		System.out.println(STR);
	}
}

