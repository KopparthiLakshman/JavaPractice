package raghavan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class naibnethod {

	

	public static void main(String[] args) throws IOException {

		System.out.println("Enter the number of cargo :");
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		int num =Integer.parseInt(inp.readLine());
		
		String inpStr;
		String[] values ;
		String status ;
		Cargo[] car = new Cargo[num] ;
		
		for (int j = 0; j < num; j++) {
			car[j] = new Cargo();
			System.out.println("Enter the Cargo "+j+1+" details");
			values = inp.readLine().toString().split(",");
			System.out.println(values[0]);
			car[j].setName(values[0].toString());
			car[j].setDescription(values[1].toString());
			car[j].setLength(Float.parseFloat(values[2].toString()));
			car[j].setWidth(Float.parseFloat(values[3].toString()));
			car[j].setStatus(values[4].toString());
			String statusInp = car[j].getStatus();
		
		System.out.println("Enter the status :");
		status = inp.readLine().toString();
		System.out.println("The cargo details are:");
		if(status.equalsIgnoreCase(statusInp)) {
			
		}
		
		}	
		
	}
	
	
}
