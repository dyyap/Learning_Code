package cs241;

public class BinaryMaxHeap2 {

      private int[] data;
      private int heapSize;
      private int swapcounter;
      private int reheapcounter;

      public void BinaryMaxHeap2(int size) {
    	  data = new int[size];
    	  heapSize = 0;
    	  swapcounter = 0;
    	  }

      public void SetSize(int size) {
    	  data = new int[size];
      }
      private int getLeftChildIndex(int nodeIndex) {
            return 2 * nodeIndex + 1;

      }

      private int getRightChildIndex(int nodeIndex) {

            return 2 * nodeIndex + 2;

      }

      private int getParentIndex(int nodeIndex) {

            return (nodeIndex - 1) / 2;

      }

            public void insert(int value) {
            			
                       data[heapSize] = value;
                       siftUp(heapSize);
                       heapSize++;
                      }
        	public boolean isEmpty() {
        		
        		return heapSize < 1;
        	}


      
            public void readHeap() {
        		System.out.println("Heap Built using insertion method:");
        		for (int i = 0; i<data.length; i++) {
        			System.out.print(data[i]+", ");
        		}
        		
        	}
        	public int removeMax() {
        	
        		  int root = data[0];
        		  data[0] = data[heapSize-1];
        		 heapSize--;
        			reheap(0);
        		
        		return root;
        	}
        	private void reheap(int rootIndex)
        	{   
			reheapcounter++;
        		boolean done = false;
        		int orphan = data[rootIndex];
        		int leftChildIndex = 2 * rootIndex;
        		
        		while (!done && (leftChildIndex <= heapSize))
        		{
        			int largerChildIndex = leftChildIndex;
        			int rightChildIndex = leftChildIndex + 1;
        			if((rightChildIndex <= heapSize) && data[rightChildIndex] > (data[largerChildIndex]))
        			{
        				largerChildIndex = rightChildIndex;
        				
        				
        			}
        			
        			if (orphan < (data[largerChildIndex]))
        			{
        				data[rootIndex] = data[largerChildIndex];
        				rootIndex = largerChildIndex;
        				leftChildIndex = 2 * rootIndex;
        			}
        			else
        				done = true;
        		}
        		data[rootIndex] = orphan;
        	}
          private void siftUp(int nodeIndex) {
        	  		swapcounter++;
                      int parentIndex, tmp;
                      if (nodeIndex != 0) {
                            parentIndex = getParentIndex(nodeIndex);
                            if (data[parentIndex] < data[nodeIndex]) {
                                  tmp = data[parentIndex];
                                  data[parentIndex] = data[nodeIndex];
                                  data[nodeIndex] = tmp;
                                  siftUp(parentIndex);

            }
         
         }
}
          
public int getSwapCounter() {
	 return swapcounter;
	 }
public int getReheapCounter() {
	return reheapcounter;
}
}