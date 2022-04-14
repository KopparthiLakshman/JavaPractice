package allprograms;


class SieveOfEratosthenes_primeNumbers {
	void sieveOfEratosthenes(int n)
	{
		
		boolean prime[] = new boolean[n+1];
		for (int i = 2; i <= n; i++) 
			prime[i] = true;
		for (int p = 2; p <= 5; p++)
		{
			if (prime[p] == true)
			{
				for (int i = p * p; i <= n; i= i+ p) {
					prime[i] = false;}
			}
		}

		for (int i = 2; i <= n; i++)
		{
			if (prime[i] == true)
				System.out.print(i + " ");
		}
	}

	public static void main(String args[])
	{
		int n = 30;
		System.out.print(
			"Following are the prime numbers ");
		System.out.println("smaller than or equal to " + n);
		SieveOfEratosthenes_primeNumbers g = new SieveOfEratosthenes_primeNumbers();
		g.sieveOfEratosthenes(n);
	}
}

