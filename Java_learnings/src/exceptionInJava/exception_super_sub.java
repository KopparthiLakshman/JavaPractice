package exceptionInJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exception_super_sub {
	void meth() throws FileNotFoundException   {
		FileInputStream fis = new FileInputStream("");
	}
}



class subClassExcep extends exception_super_sub {

	exception_super_sub onj = new exception_super_sub();

	@Override
	void meth() throws ArithmeticException{


	}

}