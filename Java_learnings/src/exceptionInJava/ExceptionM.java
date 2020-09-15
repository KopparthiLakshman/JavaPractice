package exceptionInJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionM {

	public static void main(String[] args) throws IOException {
		method();
	}

	private static void method() throws IOException {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			br.readLine();
		} 
	}
}


class ExeSub1 extends ExceptionM{
	
	void method1() throws IOException {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			br.readLine();
		}			
		
	}
}

class ExeSub2{
	
}

class ExeSub3{
	
}