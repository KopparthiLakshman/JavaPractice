package fileHandingInJava;
import java.io.*;

public class Test {
    public static void main(String [] args) {

        try {
            FileWriter fileWriter =new FileWriter("C:\\Users\\lakshman\\Desktop\\mysql.txt");
            BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
            bufferedWriter.append("Hello there,");
            bufferedWriter.append(" here is some text.");
            bufferedWriter.newLine();
            bufferedWriter.append("We are writing");
            bufferedWriter.append(" the text to the file.");

            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Error writing to ");
        }
    }
}