package collections;

import java.util.ArrayList;
import java.util.Collections;

public class PrivateInClass {

	// we cannot create MAIN class as private
	private class InnerPrivateClass{
		
	}
	
	String name ;
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		Collections.sort(list1);
	}
}
