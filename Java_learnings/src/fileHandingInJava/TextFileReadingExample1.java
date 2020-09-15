package fileHandingInJava;
 
import java.io.FileReader;
import java.io.IOException;
 
public class TextFileReadingExample1 {
 
    public static void main(String[] args) {
        try {
 
        	FileReader reader = new FileReader("MyFile.txt");
            int data_len;
 
            while ((data_len = reader.read()) != -1) {
                System.out.print((char) data_len);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}