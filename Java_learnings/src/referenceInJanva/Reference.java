package referenceInJanva;

public class Reference {

	public static void main(String[] args) {
		
		String str1 = "xyz";
		String str2 = new String("xyz");
		
		if(str1.equals(str2))
			System.out.println("TRUE equals is doing the Job");
		else 
			System.out.println("false");

		if(str1 == str2)
			System.out.println("== is NOT doing the Job");
		else 
			System.out.println("FALSE");

	}
}
