package patterns;
public class pattern5{

	public static void printRevTriangle(int n) {
		int k=1;
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print(" "+k);
				k++;
			}
			System.out.print("");
		}
	}

	public static void main(String args[]) {
		int n=10;
		printRevTriangle(n);
	}
}