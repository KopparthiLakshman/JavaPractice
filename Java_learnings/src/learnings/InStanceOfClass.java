package learnings;

public class InStanceOfClass extends Coffee{

	public InStanceOfClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Coffee isc = new InStanceOfClass();
		Coffee cfe = null;
		System.out.println(isc instanceof InStanceOfClass);
		System.out.println(cfe instanceof Coffee);
	}

	@Override
	void coffeeMaker() {
		System.out.println("Inside InInstanceOfClass Coffee maker method");
	}

}

 class Coffee{
	void coffeeMaker() {
		System.out.println("Inside instant Coffee maker method :: ssub cvalss");
	}
	
	
}