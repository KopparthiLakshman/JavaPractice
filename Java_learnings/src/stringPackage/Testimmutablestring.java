package stringPackage;

/** How to create mutable class in java 
 *  1. create a class as final which cannot be used in sub classes0
 *  2. variable as final 
 *  3. only getter - if you generate getters and setters it will generate only 
 *  getters since vaiable is FINAL*/
public final class Testimmutablestring{
	
	public String getUserName() {
		return UserName;
	}
	
	@Override
	public String toString() {
		String result = UserName;
		return result;
	}
	
	
	final String UserName = "svanyc563";
	public static void main(String args[]){  
		String s="Sachin";
		s.concat(" Tendulkar").toString();//concat() method appends the string at the end
//		System.out.println(s);
//		s = s.concat(" Tendulkar");  
//		System.out.println(s);//will print Sachin because strings are immutable objects
		String s1 = "Sachin";
		System.out.println("Cheking the == for string :"+ s==s1);
		
		StringBuffer sb = new StringBuffer("Lakshman");
		StringBuffer sb1 = new StringBuffer("Lakshman");
//		System.out.println(sb);
//		System.out.println(": equals method in SB : "+sb.equals(sb1));
		System.out.println(sb==sb1);
		
		s.equals("lakshman");
	}  
}  