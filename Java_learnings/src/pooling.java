
public class pooling {
	public static void main(String[] args) {

		String str = "Lakshman";
		System.out.println(str +"  ::  "+str.hashCode());
		str = new String("kumar");
		System.out.println(str +"  ::  "+str.hashCode());
		str.concat("o").toString();
		System.out.println(str +"  ::  "+str.hashCode());
		System.out.println(str);

		
		String str2 = str.concat("o").toString();
		System.out.println(str2 +"  ::  "+str2.hashCode());
		System.out.println(str2);

		String str3 = "kumar";
		System.out.println(str3 +"  ::  "+str3.hashCode());
		String str4 = "Lakshman";
		System.out.println(str4 +"  ::  "+str4.hashCode());
		
	}
}
