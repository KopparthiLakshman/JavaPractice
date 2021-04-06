
public class InheritanceInJava extends innerClass{
	
		InheritanceInJava in = new InheritanceInJava();
		String str2 = in.str;
	public static void main(String args[]) {
		runiing();
		InnnerClass.Java_Inner_class jic = new InnnerClass.Java_Inner_class();
//		Java_Inner_class obj = new InheritanceInJava();
		jic.method();
	}

	private static void runiing() {
		System.out.println("inside running method in inheritanceinjava");
	}
}
class innerClass {
	
	public String str = "names";
	
}