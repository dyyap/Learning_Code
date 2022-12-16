package Knapsacks;
import java.util.Arrays; 
import java.util.Comparator; 
	   

	public class FractionalKnapSack 
	{ 
		static class ItemValue  
	    { 
	        Double cost; 
	        double Value, Weight, ind; 
	          
	        // item value function 
	        public ItemValue(double wt, double val, double ind)  // gets each Items value, weight, and index
	        { 
	            this.Weight = wt; 
	            this.Value = val; 
	            this.ind = ind; 
	            cost = val/wt; 
	        } 
	    } 
	     
		
	    static double getMaxValue(final int[] Value, final int[] Weight, double cap) { 
	        ItemValue[] itemVal = new ItemValue[Weight.length]; 
	        double totalValue = 0.0; 
	        
	        for(int i = 0; i < Weight.length; i++)  { 
	            itemVal[i] = new ItemValue(Weight[i], Value[i], i); //place
	        } 
	  
	        Arrays.sort(itemVal, new Comparator<ItemValue>() { //sort
	           
	            public int compare(ItemValue object1, ItemValue object2)  
	            { 
	                return object2.cost.compareTo(object1.cost) ; // compares the costs of different items
	            } 
	        }); 
	  
	  
	        for(ItemValue i : itemVal) { //have to iterate with the my object
	  
	           double curWeight = i.Weight; 
	           double curValue = i.Value; 
	           if (cap - curWeight >= 0) { // if I can hold more
	        	    totalValue += curValue; 
	                cap -= curWeight; //calculates new capacity
	            } 
	            else  { 
	                double k = cap/curWeight; //if I cannot hold more
	                totalValue += (curValue*k); 
	                cap = (cap - (curWeight*k)); // Calculates new Capacity
	                break; 
	            }
	        } 
	  
	        return totalValue; 
	    } 
	
	    
	} 


