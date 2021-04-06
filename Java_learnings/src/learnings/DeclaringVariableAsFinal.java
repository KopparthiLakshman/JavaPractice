package learnings;

public class DeclaringVariableAsFinal {

	private final int speedlimit;//final variable
	
	/**We can intialise final variable through constructor only*/
	public DeclaringVariableAsFinal() {
	
		speedlimit=400;
		System.out.println("Sppedlimit declared ussing constructor "+speedlimit);
	
	}

	public static void main(String args[]){
//		speedlimit=400;
		//anonymous object creation in java
		new DeclaringVariableAsFinal();
	}
}
