import java.util.Arrays;
import java.util.HashSet;

// A Simple Java program to count triplets with sum smaller 
// than a given value 

class MultipleArraysinjava 
{
	public static void main(String[] args) {
		int[] inputArray1 = {2, 3, 4, 7, 1};
		int[] inputArray2 = {4, 1, 3, 5};
		int[] inputArray3 = {8, 4, 6, 2, 1};
		int[] inputArray4 = {7, 9, 4, 1};
		
		
		Integer[] inputArray6 = {2, 3, 4, 7, 1};
		Integer[] inputArray7 = {4, 1, 3, 5};
		Integer[] inputArray8 = {8, 4, 6, 2, 1};
		Integer[] inputArray9= {7, 9, 4, 1};
		union(inputArray1, inputArray2, inputArray3, inputArray4);
		intersection(inputArray7, inputArray8, inputArray6, inputArray9);
	}
	public static void intersection(Integer[] ... inputArrays){   
		for (Integer[] inputArray : inputArrays) {
			// printing arrays 
			System.out.println(Arrays.toString(inputArray));
		}

		HashSet<Integer> intersectionSet = new HashSet<>(Arrays.asList(inputArrays[0]));
		for (int i = 1; i < inputArrays.length; i++){
			HashSet<Integer> set = new HashSet<>(Arrays.asList(inputArrays[i]));
			intersectionSet.retainAll(set);
		}

		System.out.println("===========================");
		System.out.println("Intersection Of All Input Arrays :");
		System.out.println("===========================");
		System.out.println(intersectionSet);
	}
	static void union(int[] ... inputArrays)
	{
		HashSet<Integer> unionSet = new HashSet<Integer>();
		System.out.println("Input Arrays :");
		System.out.println("======================");
		for (int[] inputArray : inputArrays) 
		{
			System.out.println(Arrays.toString(inputArray));
			for (int i : inputArray) {
				unionSet.add(i);
			}
		}
		System.out.println("===========================");
		System.out.println("Union Of All Input Arrays :");
		System.out.println("===========================");
		System.out.println(unionSet);


	}
} 
