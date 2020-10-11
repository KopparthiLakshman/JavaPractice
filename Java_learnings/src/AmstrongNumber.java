
public class AmstrongNumber {

	public static void main(String[] args) {

		int a = 153;
		int in = 0;
		in = a;
		int sum = 0 , temp = 0;
		if(a>0 && a!=0)
		{
			do {
				temp = a%10;
				sum = sum + temp*temp*temp;
				a = a/10;
			}while(a>0);
			if(sum == in)
				System.out.println("Amstrong  :: "+sum);
			else 
				System.out.println("not an amstrong");
		}

	}
}