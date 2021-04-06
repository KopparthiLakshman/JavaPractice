import java.util.Arrays;
import java.util.List;

public class aaabbbcccqwer {
	public static void main(String[] args) {
		
		String str1 = "aabbccdefghhijjklaaam";
		char[] arr = str1.toCharArray();
		StringBuffer output = new StringBuffer(); 
		int c=1;
		for (int i = 0; i < arr.length; i++) {
			c=1;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					c++;
					i++;
					}
				else {
					break;
				}
			}
			output.append(Integer.toString(c)+Character.toString(arr[i]));
			output.append(",");
		}
		System.out.println(output.substring(0,output.length()-1));
		
		Integer[] inte = {1,2,3,4,5,6}; 
		List<Integer> asList = Arrays.asList(inte);
		System.out.println(asList);
		
//	String st2 = null;
//	String str3 = "Name4";
//	System.out.println(st2.concat(str3));
//	Object obj;
	
	}
}
