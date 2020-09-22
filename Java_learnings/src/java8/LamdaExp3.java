package java8;

public class LamdaExp3 {

	private static LamdaExp3 exp3;
	
	public LamdaExp3(LamdaExp3 exp3) {
		this.exp3 = exp3;
	}
	
	@Override
	public String toString() {
		String result = "Overriding the toString() in LamdaExp3";
		return result;
	}
}
