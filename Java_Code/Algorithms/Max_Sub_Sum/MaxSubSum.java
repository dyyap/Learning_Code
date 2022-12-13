package Algorithms;

import java.util.Random;

public class MaxSubSum {
	
	public static int maxSubSum1 (int[] a) {
		int maxSum = 0;
		int bounds1 = 0, bounds2 = 0;
		boolean Continue = true;
		for(int i = 0; i < a.length; ++i) {
			for(int j = i; j < a.length; ++j) {
				int Sum = 0;
				
				
				for(int k = i; k<= j; ++k) {
					Sum += a[k];
			    }
				
				if(Sum > maxSum) {
					maxSum = Sum;
					bounds1 = i;
					bounds2 = j;
				    
				}	
				}
				
			
		}
		System.out.println("Bound: " + bounds1+ "Bound: " + bounds2);	
		return maxSum;
	}


	public static int maxSubSum2(int [] a) {
		int maxSum = 0;
		int bounds1 = 0, bounds2 = 0;
		for(int i = 0; i< a.length; ++i) {
			int Sum = 0;
			for(int j = i; j < a.length; ++j) {
				Sum += a[j];
				if(Sum > maxSum) {
					maxSum = Sum;
				    bounds1 = i;
				    bounds2 = j;
				System.out.println("Bound: " + i + "Bound: " + j);	
				}
			}
		}
		return maxSum;
	}

	public static int maxSubSum3(int[] a, int left, int right) {;
		
		if(left == right) {
			if(a[left] > 0) {
				return a[left];
			}
			else
				return 0;
		}
			
		
		int mid = (left+right)/2;
		int MaxLeftSum = maxSubSum3(a, left, mid);
		int MaxRightSum = maxSubSum3(a, mid+1, right);
		int maxLeftBorderSum = Integer.MIN_VALUE, leftBorderSum = 0;
		
		for(int i = mid; i >= left; --i) {
			leftBorderSum += a[i];
			if(leftBorderSum > maxLeftBorderSum) {
				maxLeftBorderSum = leftBorderSum;
			
			}
		}
		
		int maxRightBorderSum = Integer.MIN_VALUE, rightBorderSum = 0;
		
		for(int j = mid+1; j <= right; ++j) {
			rightBorderSum += a[j];
			if(rightBorderSum > maxRightBorderSum) {
				maxRightBorderSum = rightBorderSum;
				
			}
		}
		
		
	
		if(MaxLeftSum > MaxRightSum && MaxLeftSum > maxLeftBorderSum + maxRightBorderSum) {
			return MaxLeftSum;
		}
		if(MaxRightSum > MaxLeftSum && MaxRightSum > maxLeftBorderSum + maxRightBorderSum) {
			return MaxRightSum;
		}
		return (maxLeftBorderSum + maxRightBorderSum);
		
		}
	
	public static int maxSubSum4(int[] a) {
		int maxSum = 0, Sum = 0, bounds = 0;
		for(int i = 0; i< a.length; ++i) {
			Sum += a[i];
			if(Sum > maxSum) {
				maxSum = Sum;
				bounds = i;
			}
			else if(Sum < 0)
				Sum = 0;
			
		}
		System.out.println("Bounds: " + bounds);
		return maxSum;
	} 
	
	public static void main(String[] args) {
    	long Starttime = System.nanoTime();
    	Random rand = new Random();
    	int[] a = new int[10000000
    	                  
    	                  ];
    	for(int i = 0; i < a.length; i++) {
    		a[i] = rand.nextInt();
    	}
    	
    	
    	//int z = maxSubSum1(a);
    	long StopTime1 = System.nanoTime();
    	
    	System.out.println("Stop time: " + (  StopTime1 -Starttime));
    	//System.out.println(z);
    	//maxSubSum2(a);
    	long StopTime2 = System.nanoTime();
    	System.out.println("Stop time: " + (StopTime2 - StopTime1));
    	System.out.println(maxSubSum3(a, 0, a.length-1));
    	long StopTime3 = System.nanoTime();
    	System.out.println("Stop time: " + (StopTime3 - StopTime2));
    	maxSubSum4(a);
    	
    	long StopTime4 = System.nanoTime();
    	System.out.println("Stop time: " + (StopTime4 - StopTime3));
    
	}
	
	
	}
