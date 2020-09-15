package learnings;

public class Super_Constructor {

	private String input;
	
	Super_Constructor(String input) {
		this.input= input;
	}
	
	public void meth(String defineSomething) {
		System.out.println("value in "+getClass()+"  input"+" "+ defineSomething);
	}
}

