import java.util.regex.Pattern;  
class RegexExample2{  
	public static void main(String args[]){  
		System.out.println(Pattern.matches("[a-z]+", "lakshman"));

		String numstr = "srg9 4h90asd6dfh0jdsdjryjs rnss gw0 aaaa6s5asd2";
		char[] carr = numstr.toCharArray();
		StringBuffer sb = new StringBuffer();

		for (char c : carr) {
			if(Pattern.matches("\\d", Character.toString(c)))
				sb.append(c).toString();
		}
		System.out.println(sb.toString());
	}
}
