package fileHandingInJava;
 
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
 

public class TextFileWritingExample3 {
 
    public static void main(String[] args) {
        try {
            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\lakshman\\Desktop\\mysql.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-16");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            
            bufferedWriter.newLine();
            bufferedWriter.append("Xin chào");
            bufferedWriter.newLine();
            bufferedWriter.append("H?n g?p l?i!");
             
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
         
    }
}