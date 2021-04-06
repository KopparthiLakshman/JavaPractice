package patterns;

public class pattern_print {
	public static void printTriagle(int n) { 
		int k =1;
		for (int i=1; i<n; i++) 
		{ 
			for (int j=n-i; j>0; j--) { 
				System.out.print(" "); 
			} 
			if(i%2!=0) {
				for (int j=i; j>0; j-- ) {
					System.out.print(k+" ");
					k++;
				}
			}
			else if(i%2==0)	{
				k=k+i;
				for (int j=i; j>0; j-- ) {
					k--;
					System.out.print(k+" ");
					}
				k=k+i;
			}
			System.out.println(); 
		} 
	} 

	public static void main(String args[]) { 
		int n = 10; 
		printTriagle(n); 
	} 
}

