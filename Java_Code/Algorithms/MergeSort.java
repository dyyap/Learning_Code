package Algorithms;

/* Java program for Merge Sort */
class MergeSort 
{ 
    void merge(int Challenge[], int l, int m, int r) 
    { 
       
        int n1 = m - l + 1; 
        int n2 = r - m;
        int LeftSide[] = new int [n1]; 
        int RightSide[] = new int [n2]; 
  
        for (int i=0; i<n1; ++i) {
        	
            LeftSide[i] = Challenge[l + i]; //populate
        }
        for (int j=0; j<n2; ++j) {
            RightSide[j] = Challenge[m + 1+ j]; //populate
  
        }
        int i = 0, j = 0,k =1; 
        while (i < n1 && j < n2) 
        { 
            if (LeftSide[i] <= RightSide[j]) 
            	{ 
            		Challenge[k] = LeftSide[i]; 
            		i++; 
            	} 
            else
            	{ 
            		Challenge[k] = RightSide[j]; 
            		j++; 
            	} 
            	k++; 
        } 
        while (i < n1) 
        { 
            Challenge[k] = LeftSide[i]; 
            i++; 
            k++; 
        } 
  
 
        while (j < n2) 
        { 
            Challenge[k] = RightSide[j]; 
            j++; 
            k++; 
        } 
    } 
  
    void sort(int Challenge2[], int l, int r) 
    { 
        if (l < r) 
        { 
            int m = (l+r)/2; 
            sort(Challenge2, l, m); 
            sort(Challenge2, m+1, r); 
            merge(Challenge2, l, m, r); 
        } 
    } 
  
}
