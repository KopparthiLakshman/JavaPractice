package overloadInJava;

class parentclass{

	public void b() {
		System.out.println("Method in parent class as b");
	}
	
	protected void a(){
		System.out.println("print class A in parrent class");
	}
}

class childclass extends parentclass{
	
/** 1. overriding Method should have same signature as parent method 
 * 	we cannot override a private method
 *  2. if super class method does not declare any exception then
 *  subclass should not declare any exception/ 
 *  should not declare the *same* exception according to point.1*/
	
	@Override
	protected void a() {
		System.out.println("overriding class a in parrent class in child class");
	}

	public void x() {
//			super.b();
			System.out.println("Overriding the method b in chlid class method b");
		}
}

class OverRideInJava {
	
	public static void main(String[] args) {
		
		parentclass parent = new parentclass();
		childclass chil = new childclass();
		parentclass pc1 = new childclass();
		childclass chil1 = (childclass) parent;
		
		
//		childclass pc2 =  (childclass) new parentclass(); - this is not possible 
//		Exception in thread "main" java.lang.ClassCastException: overloadInJava.parentclass cannot be cast to overloadInJava.childclass
//		at overloadInJava.OverRideInJava.main(OverRideInJava.java:40)
		parent.a();
		chil.a();

		
	}
}
