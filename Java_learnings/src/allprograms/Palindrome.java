package allprograms;
public class Palindrome {


	public static void main(String[] args) {

		//		Scanner sc = new Scanner(System.in);
		//		sc.hasNext();
		String input = "qwerrewq";
		char[] inchar = input.toCharArray();
		int count =0;
		for (int i = 0; i < input.length()/2; i++) {
			if((Character.toString(inchar[i])).equals(Character.toString(inchar[inchar.length-i-1])))
			{
				count++;
			}
		}
		System.out.println(count);
		if(count==(input.length()/2) && input.length()%2 !=0)
			System.out.println(count+1);
		else if (input.length()/2==count && input.length()%2==0)
			System.out.println(count);
		else 
			System.out.println("Not a palyndrome");
	}
	
	
}




