public class DigitsDemo
{
	public static void main ( String[] args )
	{

		java.text.NumberFormat nf = new java.text.DecimalFormat("0000");
		for(int i=1; i<=9999; i++)
			System.out.println(nf.format(i));
		
		String str = "aaa ihtss a qwerty trewq";
//		String[] out  = str.split(" ");
//		
//		for (String string : out) {
//			System.out.println(string);
//		}

		String result = new String("aaa developed asdfg software").replaceAll(" ", "-");
		System.out.println(result);
		str.equals(" ");
		int n = 0;
		do
		{
			System.out.println(n);
			n--;
		}while(n>=0);
		
		
		System.out.println("-------------------");
		n=3;
		while(n>=0)
		{
			System.out.println(n);
			n--;
		}

		
	}
}