package allprograms;
import java.util.ArrayList;

public class aFibanocciSeries {

	public static void main(String[] args) {
	
		int firstNumber = 0;
		int secondNumber= 1;
		int count = 10;
		int out;
		
//		Integer.
		
//		Scanner sc = new  Scanner(System.in);
//		sc.next();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(firstNumber);
		list.add(secondNumber);
		
		for(int i=2; i<count; i++)
		{
			out = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = out;
			list.add(out);
		}
		
		System.out.println(list);
//		sc.close();
	}
}
