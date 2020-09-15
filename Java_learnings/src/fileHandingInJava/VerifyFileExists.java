package fileHandingInJava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.zip.GZIPInputStream;

public class VerifyFileExists {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String path = "C:\\Users\\lakshman\\Desktop";
		File file = new File(path, "mysql.txt");
		System.out.print("File is availabe in the specific path provided :: "+ file.exists());

		String name = "mysql.txt";
		File file2 = new File("*//Desktop", name);
		System.out.print("\nPath and file is not availabe :: "+file2.exists());

		String parent = null;
		File file_new = new File(parent, "myfile.txt");
		try {
			file_new.createNewFile();
			System.out.print("\nPath and file is not availabe :: "+ file_new.exists());
			System.out.print("\nGet absolute path :: "+ file_new.getAbsolutePath());
			System.out.print("\nGet canonical path :: "+ file_new.getCanonicalPath());
			System.out.print("\nGet path :: "+ file_new.getPath());
		}
		catch (IOException e) {
			e.printStackTrace();
		}


		File file3 = new File("../file.txt");
		FileWriter file3Writer;
		try {
			file3Writer = new FileWriter(file3);
			BufferedWriter bufferedOutputWriter = new BufferedWriter(file3Writer);
			System.out.print("\nGet absolute path :: "+ file_new.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileOutputStream fileOutputStream = new FileOutputStream(new File("myfile.txt"));
			System.out.println("file exists");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		final Reader fileReader;
		if (file.getName().endsWith(".gz")) {
			final GZIPInputStream inputStream =new GZIPInputStream(new FileInputStream(file));
			fileReader = new InputStreamReader(inputStream);
		} 
		else {
			fileReader = new FileReader(file);
		}
	}
}
