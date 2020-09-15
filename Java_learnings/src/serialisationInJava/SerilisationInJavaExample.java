package serialisationInJava;

import java.io.*;

public class SerilisationInJavaExample {

	
	public static void main(String[] args) throws Exception {
		
		String str = "Serilisation in java ";
		int rollNumber = 044;
		String Name = "Oracle";
		
		File src = new File("C:\\Users\\lakshman\\Desktop\\Serilisation.txt");
		FileOutputStream  fos = new FileOutputStream (src);
		ObjectOutputStream obj = new ObjectOutputStream(fos);
		obj.writeObject(src);
		obj.writeObject(rollNumber);
		obj.close();
		fos.close();
		
		
		FileInputStream  fis = new FileInputStream (new File("C:\\Users\\lakshman\\Desktop\\Serilisation.txt"));
		ObjectInputStream obj2 = new ObjectInputStream(fis);
		obj2.readObject();
		String str2 = obj2.toString();
		System.out.println(str2);
		obj2.close();
		fis.close();
		
	}


}
