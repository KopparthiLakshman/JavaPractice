package raghavan2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	float length = 12;
	public static void main(String[] args) throws IOException {
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number of containers :");
		int n = Integer.parseInt(buff.readLine());
		
		Container[] container = new Container[n];
        
		for(int i=0;i<n;i++) {
            
			container[i] = new Container();
			System.out.println("Enter the container "+(i+1)+" details :");
			//fill the code
			container[i].setContainerNumber("10.12");
            System.out.println(container[i].getContainerNumber());
		}
		
		System.out.format("Container details are\n%-20s %-15s %-15s %-15s %s\n","Container Number","Length","Width","Height","Weight");
		//fill the code
		
	}
}