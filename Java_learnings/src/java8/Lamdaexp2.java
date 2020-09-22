package java8;

public class Lamdaexp2 extends LamdaExp3{
	
	public Lamdaexp2(LamdaExp3 exp3) {
		super(exp3);
	}

	public static void main(String[] args) {

		MyAdd myAddiionLamda = (a, b) -> a+b;
		System.out.println(myAddiionLamda.add(2, 2));
		
		MyString slen = s -> s.length();
		System.out.println(slen.length1("Searching"));
	}

}

interface MyAdd{
	public int add(int y, int x);
}

interface MyString{
	public int length1(String s);
}