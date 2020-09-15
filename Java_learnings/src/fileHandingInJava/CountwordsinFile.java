package fileHandingInJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountwordsinFile {

	public static void main(String[] args) throws IOException{
	
		String line = null;
		File file = new File("D:\\myfile.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		int countWords = 0;
		do {
			line = bufferedReader.readLine();
			countWords = line.split(" ").length;
		} while(line != null);
	}
}