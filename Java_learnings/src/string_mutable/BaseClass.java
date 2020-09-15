package string_mutable;

public class BaseClass {

	
	public static void main(String[] args) {
		String str = "Lakshman";
		String str1 = "Lakshman";
		/**In this case it will change the address of str in HeapMemory*/ 
		String str2 = new String("Lakshman");
		
		/**In this case it will create new object reference in HEAP memory*/
		String new_str = new String(str2);
		
		System.out.println(str.equals(str2));
		System.out.println(str==str2);
		
		
	}
}
