package learnings;

public class ExecutionWithoutMain {
	
	
	public static void main(String[] args) {
		System.out.println("main methos execution in java @next to static block");
	}
	
	static {
		System.out.println("static block eexecution in java ");
	    }
	
	{
		System.out.println("Instance block eexecution in java ");
	}
}
