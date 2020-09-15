package fileHandingInJava;
import java.io.*;

public class TestRead {
    public static void main(String [] args) {

        String fileName = "D:\\myfile.txt";
        String line = null;

        try {

        	FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while(bufferedReader.readLine() != null) {
                System.out.println(bufferedReader.readLine());
            }   
            bufferedReader.close();         
        }
        
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");                  
        }
    }
}