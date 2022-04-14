package allprograms;

public class exam extends inner{

	
	private static String name = "Java";
	static String name3 = new String(name);
	private static String name2 = "Java";
	
	
	public exam() {
		System.out.println("current class constructor");
	}

	private exam(int i) {
		super();

	}
	public static void main(String[] args) {
			System.out.println(name==name2);
			System.out.println(name3.equals(name));
			System.out.println(name3==name);
			new exam(3);
	}
}
class inner{
	
	public inner() {
		System.out.println("Printing From super calss constructor inner");
	}
}

