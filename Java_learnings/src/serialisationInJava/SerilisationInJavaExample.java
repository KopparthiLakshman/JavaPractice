package serialisationInJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilisationInJavaExample {


	public static void main(String[] args) throws Exception {

//		String str = "Serilisation in java ";
		int rollNumber = 044;
//		String Name = "Oracle";

		File src = new File("C:\\Users\\DELL\\Desktop\\Serilisation.txt");
		if(src.exists()) {
			FileOutputStream  fos = new FileOutputStream (src);
			ObjectOutputStream obj = new ObjectOutputStream(fos);
			obj.writeObject(src);
			obj.writeObject(rollNumber);
			obj.close();
			fos.close();
		}

		FileInputStream  fis = new FileInputStream (new File("C:\\Users\\DELL\\Desktop\\Serilisation.txt"));
		ObjectInputStream obj2 = new ObjectInputStream(fis);
		obj2.readObject();
		String str2 = obj2.toString();
		System.out.println(str2);
		obj2.close();
		fis.close();

	}


}
