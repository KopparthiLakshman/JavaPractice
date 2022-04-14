package allprograms;

public class InnnerClass {
	
	private static int idno = 123456;
	
	public static void main(String[] args) {
		
		InnnerClass.Java_Inner_class jic = new InnnerClass. Java_Inner_class();
		jic.method();
	}
	
	static class Java_Inner_class{  
		
		void method() {
				System.out.println(idno);
		}
	}  
}

