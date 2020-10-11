public class Altemetrix {
	
	public String strp = "inside class";
	public String maintenenace() {
		return "Printing From parent class Altemetrix class";
	}
	
	public static void main(String[] args) {
//		ChildAlt2 a = (ChildAlt2) new Altemetrix();
//		System.out.println(a.maintenenace());
		ChildAlt2 b = new ChildAlt2();
		System.out.println(b.maintenenace());

	}
}

 class ChildAlt2 extends Altemetrix{
	
	public String maintenenace(int x) {
		return "Printing From Child Alt2 class";
	}
}