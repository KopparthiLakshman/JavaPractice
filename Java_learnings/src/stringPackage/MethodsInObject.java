package stringPackage;

public class MethodsInObject {

	public static void main(String[] args) {
		
		
		// String mutable and immutable in java 
		String str = "PrimaryVaueInString";
		System.out.println(str +"  : "+str.hashCode());
		str = str.concat(" New");
		System.out.println(str +"  : "+str.hashCode());

		String str2 = "Java is";
		str2.concat(" coding");
		str2 = str2.concat(" Language");
		System.out.println(str2);

		String str3 = "Selenium ";
		str2.concat(" is");
		str2 = str2.concat(" Scipting");
		System.out.println(str2);

		
		StringBuffer sb = new StringBuffer("FirstData ");
		System.out.println(sb +"  : "+sb.hashCode());
		sb.append("PrimaryVaueInString").toString();
		System.out.println(sb +"  : "+sb.hashCode());
		sb.equals(sb);
		
		String s1 = "DellLaptop";
		String s2 = "DellLaptop";
		
		System.out.println(" String pooling in Java");
		System.out.println("Reference for S1 :: "+s1.hashCode());
		System.out.println("Reference for S1 :: "+s2.hashCode());

		StringBuffer sb2 = new StringBuffer("FirstData ");
		StringBuffer sb3 = new StringBuffer("FirstData ");
		System.out.println("String Buffer for Sb2 :: "+sb2.hashCode());
		System.out.println("String Buffer for Sb3 :: "+sb3.hashCode());
		
		System.out.println(sb3==sb2);
		System.out.println(sb3.equals(sb2));
		
		
		if(s1==s2 && s1.equals(s2))
		{
			System.out.println("Test Pass == & .equals");
		}
		
	}
	
}
