package learnings;

interface A{  
	void a();  
	void b();  
	void c();  
	void d();  
}  


abstract class B implements A{

	/**If an method is declared without body should be a type 
	 * of abstract in abstract class*/
//	abstract void absMethod();

	/**Methods can be declared without abstract keyword in abstract class
	 * - when it is been implemented*/
//	void implementedMethod() {
//
//	}
	
	@Override
	public void a() {
		System.out.println("Implementing methos a() ");
	}

	public void e() {System.out.println("calling method e() from abstract class");};

	
}

	class C extends B{

		@Override
		public void b() {
			System.out.println("Implementing methos b() ");
		}

		@Override
		public void c() {
			System.out.println("Implementing methos c() ");
		}

		@Override
		public void d() {
			System.out.println("Implementing methos d() ");
		}

		void absmeth() {
			
		}

	}

public class Absraction_in_Java {

	public static void main(String[] args) {
		
		// through inheritance we can achieve run time polymorphism
		A objA = new C();
		objA.a();
		objA.b();
		objA.c();
		objA.d();
		
		
	}
}
