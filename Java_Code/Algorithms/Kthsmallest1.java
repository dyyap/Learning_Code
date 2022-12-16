package Algorithms;

import java.util.Random;

public class Kthsmallest1 {
	  private static int[] trimToSize(int[] arr, int size)
	   {
	       int[] temp = new int[size];
	       for (int i = 0; i < size; i++)
	       {
	           temp[i] = arr[i];
	       }
	       return temp;
	   }
	  private static void sort(int arr[], int begin, int end) // implemented in previous project
	   {
	       if (begin < end)
	       {
	           int pivot = arr[end];
	           int i = (begin - 1);

	           for (int j = begin; j < end; j++)
	           {
	               if (arr[j] <= pivot)
	               {
	                   i++;

	                   int swapTemp = arr[i];
	                   arr[i] = arr[j];
	                   arr[j] = swapTemp;
	               }
	           }

	           int swapTemp = arr[i + 1];
	           arr[i + 1] = arr[end];
	           arr[end] = swapTemp;

	           int partitionIndex = i + 1;

	           sort(arr, begin, partitionIndex - 1);
	           sort(arr, partitionIndex + 1, end);
	       }
	   }
	
	public static int Select1(int k, int[]S){
		if(S.length == 1)
			return S[0];
		Random rand = new Random();
		int m = S[rand.nextInt(S.length)];
		int[] x = new int[S.length];
		int[] y = new int[S.length];
		int[] z= new int[S.length];
		
		int a = 0, b = 0, c = 0; // pointers
		
		for(int i = 0; i <S.length; i++) {
			if(S[i] < m) {
				x[a] = S[i];
				a++; // less than
			}
			
			else if(S[i] == m) {
				y[b] = S[i]; // equal
				b++;
			}
			else {
				z[c] = S[i];
				c++; // greater than
			}
			
		}
	       x = trimToSize(x, a);
	       y = trimToSize(y, b);
	       z = trimToSize(z, c);
		
	       if (x.length >= k)
	           return Select1(k, x);
	       else if (y.length + y.length >= k)
	           return m;
	       else
	           return Select1(k - x.length - y.length, z);
		
	}
	 public static int Select2(int k, int[] S)
	   {      
	       if (S.length < 50)
	       {
	           sort(S, 0, S.length - 1);
	           return S[k - 1];
	       }

	       for (int i = 0; i < S.length; i += 5)
	       {
	           if (i + 4 < S.length)
	               sort(S, i, i + 4);
	           else
	               sort(S, i, S.length - 1);
	       }
	      
	       int[] M = new int[(int)Math.ceil(S.length / 5.0)];
	      
	       for (int i = 0, j = 0; i < S.length; i += 5, j++)
	       {
	           if (i + 4 < S.length)
	               M[j] = S[(2 * i + 4) / 2];
	           else
	               M[j] = S[(i + S.length - 1) / 2];              
	       }      

	       int m = Select2(M.length / 2 + 1, M);
	       int[] x = new int[S.length];
	       int[] y = new int[S.length];
	       int[] z = new int[S.length];
	       int a = 0;
	       int b = 0;
	       int c = 0;

	       for (int i = 0; i < S.length; i++)
	       {
	           if (S[i] < m)
	           {
	               x[a] = S[i];
	               a++;
	           }
	           else if (S[i] == m)
	           {
	               y[b] = S[i];
	               b++;
	           }
	           else
	           {
	               z[c] = S[i];
	               c++;
	           }
	       }

	       x = trimToSize(x, a);
	       y = trimToSize(y, b);
	       z = trimToSize(z, c);

	       if (x.length >= k)
	           return Select2(k, x);
	       else if (x.length + S.length >= k)
	           return m;
	       else
	           return Select2(k - x.length - y.length, z);
	   }
	 
	 
	 
	 public static void main(String[] args) {
			int size = 1000000;
			long StartTime = System.nanoTime();
			Random rand = new Random();
			int[] arr = new int[100];
			for(int i = 0; i < arr.length; i++) {
				arr[i] = Math.abs(rand.nextInt());
			}
			
			int[] test1 = new int[size];
			int[] test2 = new int[size];
			
			test1 = arr;
			test2 = arr;
			
			Select1(10, test1); 
			long mid1 = System.nanoTime();
			System.out.println("Time: " + (mid1 - StartTime));
			
			Select2(10, test2); 
			long end = System.nanoTime();
			System.out.println("Time: " + (end - mid1));
			
			
	 }
}
