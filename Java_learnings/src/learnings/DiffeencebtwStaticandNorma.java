package learnings;

public class DiffeencebtwStaticandNorma {

	
	
	class Amstrong{
		void method() {
			System.out.println("method inside non static class");
		}
	}

	
	static class staticClass{
		void method1() {
			System.out.println("method inside static class");
		}
	}
	
	
	public static void main(String[] args) {
		
//		object cannot be created directly since non static class and inner class
		//inner class objects
		Amstrong a = new DiffeencebtwStaticandNorma().new Amstrong() ;
		staticClass sc = new staticClass();
		a.method();
		sc.method1();

		
	}
}
