package learnings;

public class DeclaringVariableAsFinal {

	private final int speedlimit = 4110;//final variable
	
	/**We can intialise final variable through constructor only*/
	public DeclaringVariableAsFinal() {
	
//		speedlimit=400;s
		System.out.println("Sppedlimit declared ussing constructor "+speedlimit);
	
	}

	public static void main(String args[]){
		
		//anonymous object creation in java
		new DeclaringVariableAsFinal();
	}
}
