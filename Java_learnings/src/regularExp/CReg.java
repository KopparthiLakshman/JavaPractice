package regularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CReg {

	public static void main(String[] args) {
		
		String input= "\"Lakshman";
		Pattern pat = Pattern.compile("\"a-zA-Z");
		Matcher mat = pat.matcher("\"");
		System.out.println(mat.matches());
		
	}
	
	
	/**
	 * 
	 *  
	 * 
	 * */
	
	
}
