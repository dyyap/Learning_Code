package Algorithms;

import java.util.Random;
import java.util.Arrays;

public class KthSmallest {

	
	
	public static void KthSmallest1(int[] sorting, int k) {
		Arrays.sort(sorting);
		System.out.println(sorting[k -1]);
		
	}
	
	public static void KthSmallest2(int[] sorting, int start, int stop,int k) {
		MergeSort a = new MergeSort();
		a.sort(sorting, start, stop);
		System.out.println(sorting[k -1]);
		
	}
	
	public static void main(String[] args) {
		int size = 1000000;
		long StartTime = System.nanoTime();
		Random rand = new Random();
		int[] arr = new int[100];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt();
		}
		
		int[] test1 = new int[size];
		int[] test2 = new int[size];
		
		test1 = arr;
		test2 = arr;
		
		KthSmallest1(test1, 10); // java implemented sor
		long mid1 = System.nanoTime();
		System.out.println("Time: " + (mid1 - StartTime));
		
		KthSmallest2(test2,size,0,10); // Mergesort
		long end = System.nanoTime();
		System.out.println("Time: " + (end - mid1));
		
		
	}
}
