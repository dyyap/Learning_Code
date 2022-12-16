package Algorithms;

public class SumOSubRecursive {

	static boolean isSubSum(int set[], 
	               int x, int sum) 
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
	
}