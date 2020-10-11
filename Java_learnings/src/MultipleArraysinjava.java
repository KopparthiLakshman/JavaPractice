import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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

		Integer[] inputArray10 = {2, 3, 4, 7, 1};
		Integer[] inputArray11 = {4, 1, 3, 5};
		Integer[] inputArray12 = {8, 4, 6, 2, 1};
		Integer[] inputArray13 = {7, 9, 4, 1};

		
		
		List<Object> olist = new ArrayList<>();
		olist.add(inputArray9);
		
//		System.out.println(Arrays.asList(inputArray9));
		
		intersection(inputArray7, inputArray8, inputArray6, inputArray9);
		union(inputArray1, inputArray2, inputArray3, inputArray4);
		union2(inputArray13, inputArray12, inputArray11, inputArray10);
		
	}
	
	private static void union2(Integer[]... inputArray1) {
		System.out.println("=============printing set==============");
		Set<Integer> union2 = new LinkedHashSet<>();
		for (int i = 0; i < inputArray1.length; i++){
			union2.addAll(Arrays.asList(inputArray1[i]));
		}
		System.out.println(union2);// printing arrays
	}

	public static void intersection(Integer[]... inputArrays){   
		System.out.println("=============printing arrays==============");
		for (Integer[] inputArray : inputArrays) {
			System.out.println(Arrays.toString(inputArray)); // printing arrays
		}

		Set<Integer> intersectionSet = new LinkedHashSet<>(Arrays.asList(inputArrays[0]));
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < inputArrays.length; i++){
			list = Arrays.asList(inputArrays[i]);
			intersectionSet.retainAll(list);  //  printing arrays
		}

		System.out.println("===========================");
		System.out.println("Intersection Of All Input Arrays :");
		System.out.println(intersectionSet);
		System.out.println("===========================");
	}
	static void union(int[]...  inputArrays)
	{
		LinkedHashSet<Integer> unionSet = new LinkedHashSet<Integer>();
		System.out.println("Input Arrays :");
		System.out.println("======================");
		for (int[] inputArray : inputArrays) 
		{
			System.out.println("to string :-- "+Arrays.toString(inputArray));
			for (int i : inputArray) {
				unionSet.add(i);
			}
		}
		System.out.println("===========================");
		System.out.println("Union Of All Input Arrays :");
		System.out.println("===========================");
		System.out.println(unionSet);// printing set


	}
} 
