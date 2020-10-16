package exam1;

import java.util.Arrays;
import java.util.Collections;

public class ThirdHighest {

	public static void main(String[] args) {
		
		Integer[] num = {9,8,7,6,123,5,4,3,2,1};
		int n;
		
		Arrays.sort(num, Collections.reverseOrder());
		System.out.println(Arrays.asList(num));
		
	}
	
}
