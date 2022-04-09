// Java program to sort an array of 0, 1 and 2

class countzot {

	// Sort the input array, the array is assumed to
	// have values in {0, 1, 2}
	// [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
	static void sort012(int a[], int arr_size)
	{
		int zeroIndex = 0, runningIndex=0, temp = 0;
		
		int sizeOfArray = arr_size - 1;
		
		while (runningIndex <= sizeOfArray) {
			switch (a[runningIndex]) {
			case 0: {
				temp = a[zeroIndex];
				a[zeroIndex] = a[runningIndex];
				a[runningIndex] = temp;
				zeroIndex++;
				runningIndex++;
				break;
			}
			case 1:
				runningIndex++;
				break;
			case 2: {
				temp = a[runningIndex];
				a[runningIndex] = a[sizeOfArray];
				a[sizeOfArray] = temp;
				sizeOfArray--;
				break;
			}
			}
		}
	}

	/* Utility function to print array arr[] */
	static void printArray(int arr[], int arr_size)
	{
		int i;
		for (i = 0; i < arr_size; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}

	/*Driver function to check for above functions*/
	public static void main(String[] args)
	{
		int arr[] = { 1, 1, 0, 2, 0, 0, 1, 1, 1, 0, 0, 0, 2, 2, 2, 2, 1, 0, 2 };
		int arr_size = arr.length;
		sort012(arr, arr_size);
		System.out.println("Array after seggregation ");
		printArray(arr, arr_size);
	}
}
/*This code is contributed by Devesh Agrawal*/
