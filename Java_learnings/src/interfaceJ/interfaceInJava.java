package interfaceJ;


public interface interfaceInJava{  

	int a = 2;
	//		protected void protect();  
	//	private void protect();

	static void implMethod() {
		System.out.println(" adfasfng v");
	}

	public void c();
	void d();

	
	public static abstract class A {
		public abstract void methodA();
	}


	/***/
	class insideInterface extends A{
		@Override
		public void methodA() {
			// TODO Auto-generated method stub
		}	
	}
	
	abstract void absMethod();
}  

