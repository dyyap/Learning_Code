package Algorithms;

import java.util.Scanner;

class HuffmanTreeNode implements Comparable<HuffmanTreeNode>{
	char[] st;
	int frequency;
	
	public int compareTo(HuffmanTreeNode o) {
		if(frequency > o.frequency) {
			return frequency;
		}
		else
			return o.frequency;
	}

	
}

public class HuffmanRedo {
	Scanner s = new Scanner(System.in); 
	  
    // number of characters. 
    int n = 6; 
    char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' }; 
    int[] charfreq = { 5, 9, 12, 13, 16, 45 }; 

    // creating a priority queue q. 
    // makes a min-priority queue(min-heap). 
    PriorityQueue<HuffmanNode> q 
        = new PriorityQueue<HuffmanNode>(n, new MyComparator()); 

    for (int i = 0; i < n; i++) { 

        // creating a Huffman node object 
        // and add it to the priority queue. 
        HuffmanNode hn = new HuffmanNode(); 

        hn.c = charArray[i]; 
        hn.data = charfreq[i]; 

        hn.left = null; 
        hn.right = null; 

        // add functions adds 
        // the huffman node to the queue. 
        q.add(hn); 
    } 

    // create a root node 
    HuffmanNode root = null; 

}
