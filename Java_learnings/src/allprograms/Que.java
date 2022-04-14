package allprograms;
/**
 * Take the string "PROLEARNING" and reverse the string at every 4 characters : example the result should be LORP NRAE GNI
 * 
 */


import java.util.ArrayList;
import java.util.List;

public class Que {
public static void main(String[] args) {
	
		String input = "SYDNEYISNOTTHE CAPITALOFAUSTRALIA";
		List<String> list = new ArrayList<String>();
		int num =6;
		if(input.length()>num) {
			for (int i = 0; i < input.length(); i=i+num) {
				if((i+num)>input.length()) 
				{
					list.add(input.substring(i, input.length()).toString());
					break;
				}
				else
					list.add(input.substring(i, i +num).toString());
			}
			System.out.println(list);
		}
		else if (input.length()==num || input.length()<num)
		{
			System.out.println(input);
		}

	}
}
