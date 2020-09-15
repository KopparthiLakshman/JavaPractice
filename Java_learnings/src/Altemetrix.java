
public class Altemetrix {
	
	public String strp = "inside class";
	public String maintenenace() {
		return "inside alt2";
	}
	
	public static void main(String[] args) {
//		alt2 a = (alt2) new Altemetrix();
		alt2 a = new alt2();
		System.out.println(a.maintenenace());
	}
}

 class alt2 extends Altemetrix{
	
	public String maintenenace() {
		return "insider";
	}
}