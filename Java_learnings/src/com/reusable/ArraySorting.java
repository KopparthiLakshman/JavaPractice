package com.reusable;

import java.util.Arrays;

public class ArraySorting {
	
//	public static void main(String[] args) {
//		String[] inp = {"bcd","has","gfee","a","ad"};
//		sort(inp);
//		System.out.println(Arrays.toString(inp));
//	}
	
	public static String[] sort(String[] inp) {
		String t;
		for(int i=0; i<inp.length; i++) {
			for(int j=1; j<inp.length; j++) {
				if(inp[j-1].compareTo(inp[j])>0)
				{
					t=inp[j-1];
					inp[j-1]=inp[j];
					inp[j]=t;
				}
			}
		}
		return inp;
	}
}