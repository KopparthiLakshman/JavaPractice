package stringPackage;

import java.util.StringTokenizer;

public class Stokenizer {

	public static void main(String[] args) {
		StringTokenizer str = new StringTokenizer("Sun rises in the EAST", " ");
		System.out.println(str.countTokens());
		System.out.println(str.nextToken());
	}
}
