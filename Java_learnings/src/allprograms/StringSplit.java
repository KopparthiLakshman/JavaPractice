package allprograms;
import java.util.Arrays;

public class StringSplit {
	public static void main(String[] input)
	{
		int temp =0, c=0, bindex=0, n=0;
		String inp[];
		String names = "Raghavan";
		n=3;
		inp = new String[names.length()];
		if(n>=names.length())
			System.out.println("Number :n: is not lesser than length of input string :: "+names);
		else {
			for (int k = 0; k < names.length(); k++) {
				temp++;
				if(temp%n==0) {
					inp[c]= names.substring(bindex, k+1).trim();
					c++; 
					bindex = k+1;
					temp=0;
				}
				if((k+1)==names.length() && ((temp%n)!=0))	{
					inp[c] = names.substring(bindex, k+1).trim();
					inp = Arrays.copyOf(inp, c+1);
				}
			}
			if(temp%n==0) {
				inp = Arrays.copyOf(inp, c);
			}
		}
		Arrays.sort(inp);
		System.out.println(Arrays.toString(inp));
		System.out.print("Words/Names Sorted in Alphabetical Order Successfully..!!");
		System.out.println("\nNow the List is :");
		System.out.println(Arrays.toString(inp));
	}
}
