package Algorithms;

import java.util.Random;

public class SumOfSub {
	
	static int MaxSubSum(int array[],int size)  
	{  
	      
	    int max = 0, 
	    	ending = 0,   
	    	start = 0, 
		    end = 0,
	        s = 0;
	  
	    for (int i = 0; i < size; i++)  
	    {  
	        ending = ending + array[i]; 
	        if (ending < 0)  {
	            ending = 0;  
	            start = s; 
                end = i; 
	        }
	     
	        else if (max < ending)
	            max = ending;  
	          
	    }  
	    return max;  
	}  
	

	static boolean isSubSum(int set[], 
	               int x, int sum) // this one I took from my previous algorithms class which I am retaking
	{ 
			   
			   if (sum == 0)  // it exists
				   	return true; 
			   
			   if (x == 0 && sum != 0) 
				   return false; 

			   // If last element is greater than  
			   // sum, then ignore it 
			   if (set[x-1] > sum) 
				   return isSubSum(set, x-1, sum); 


			   return isSubSum(set, x-1, sum) ||  isSubSum(set, x-1, sum-set[x-1]); 
	}
	
	 static int MaxSubArraySum2(int array[], int size) 
	    { 
	    int max = array[0]; 
	    int curr_max = array[0]; 
	  
	    for (int i = 0; i < size; i++) 
	    { 
	           curr_max = Math.max(array[i], curr_max+array[i]); 
	           max = Math.max(max, curr_max); 
	    } 
	    return max; 
	    } 
	 

	    static void MaxSubArraySum3(int array[], int size) 
	    { 
	        int max = Integer.MIN_VALUE, 
	        ending = 0,
	        start = 0, 
	        end = 0, 
	        s = 0; 
	  
	        for (int i = 0; i < size; i++)  
	        { 
	            ending += array[i]; 
	  
	            if (max < ending)  
	            { 
	                max = ending; 
	                start = s; 
	                end = i; 
	            } 
	  
	            if (ending < 0)  
	            { 
	                ending = 0; 
	                s = i + 1; 
	            } 
	        } 
	System.out.println(max);
	System.out.println(start);
	System.out.println(end);
	    } 

	    public static void main(String[] args) {
	    	long Starttime = System.nanoTime();
	    	Random rand = new Random();
	    	int[] a = new int[10000000];
	    	for(int i = 0; i < a.length; i++) {
	    		a[i] = rand.nextInt();
	    	}
	    	
	    	
	    	int z = MaxSubSum(a, 10000000);
	    	long StopTime1 = System.nanoTime();
	    	
	    	System.out.println("Stop time: " + (  StopTime1 -Starttime));
	    	System.out.println(z);
	    	//System.out.println(isSubSum(a, 100000, z));
	    	long StopTime2 = System.nanoTime();
	    	System.out.println("Stop time: " + (StopTime2 - StopTime1));
	    	System.out.println(MaxSubArraySum2(a, 10000000));
	    	long StopTime3 = System.nanoTime();
	    	System.out.println("Stop time: " + (StopTime3 - StopTime2));
	    	MaxSubArraySum3(a, 10000000);
	    	
	    	long StopTime4 = System.nanoTime();
	    	System.out.println("Stop time: " + (StopTime4 - StopTime3));
	    
	    	
	    	
	    }
}
