package abstraction;


public abstract class Absraction {

	public Absraction() {
		System.out.println("Auto-generated constructor stub");
	}
//	public abstract void a();  
//	/*private */abstract void b();  
//	protected abstract void c();  
//	abstract void d();  
//	/*default*/ abstract int memoryc();

	void e() {
		System.out.println("::::method::::");
	}

	abstract void ee();
}

/**We cannot extend an abstract class to an interface */
//interface extInter extends Absraction{
//	
//}


/**we need to declare another class as abstract to inherit parent abstract class
 * we cannot specify child class as public in inner class
 * and we need to implement all methods from parent class*/
 /*public *//*abstract*/ class innerclas extends Absraction{

	@Override
	void ee() {
		// TODO Auto-generated method stub
		
	}
	Absraction abs = new Absraction() {
		
		@Override
		void ee() {
			
		}
	};
 
 }

 
 