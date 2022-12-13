package Algorithms;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

class Node {
	int data;
	char c;
	
	Node left;
	Node Right;
}





class Compare implements Comparator<Node> {
	public int compare(Node x, Node y) {
		return x.data - y.data;
	}
}

public class Huffman {
	
	static HashMap<Character, String> Encode = new HashMap<Character, String>();
	static HashMap<String, Character> Decode = new HashMap<String, Character>();
	
	public static void PrintTree(Node root, String s) {
		if(root.left == null && root.Right == null && Character.isLetter(root.c)) {
			System.out.println(root.c + ": " + s);
			Encode.put(root.c, s);
			Decode.put(s, root.c);
			return;
		}
		
		//recursive encoding // making the tree
		PrintTree(root.left, s + "0");
		PrintTree(root.Right, s + "1");
		
	}
	
	private static String encode(String test) {
		StringBuilder s = new StringBuilder();

		for (int i = 0; i < test.length(); i++) {
			char c = test.charAt(i);
			s.append(Encode.get(c));
		}

		
		return s.toString();
	}
	

	private static void decode(String s, Node root) {

		StringBuilder stringBuilder = new StringBuilder();

		Node temp = root;

		System.out.println("Encoded: " + s);

		for (int i = 0; i < s.length(); i++) {
			int j = Integer.parseInt(String.valueOf(s.charAt(i)));

			if (j == 0) {
				temp = temp.left;
				if (temp.left == null && temp.Right == null) {
					stringBuilder.append(temp.c);
					temp = root;
					
				}
			}
			if (j == 1) {
				temp = temp.Right;
				if (temp.left == null && temp.Right == null) {
					stringBuilder.append(temp.c);
					temp = root;
					
				}
			}
			
		}

		System.out.println("Decoded string is " + stringBuilder.toString());

	}
		
	
	public static void main(String[] args) { 
 
        int n = 26; 
        char[] charArray = {'a' , 'b', 'c', 'd', 'e', 'f', 'g', 'h','i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' }; 
        int[] charfreq = {14810,2715, 4943, 7874,  21912, 4200, 3693, 10795, 13318, 188, 1257, 7253, 4761, 12666, 14003, 3316,  205, 10977, 11450, 16587, 5246, 2019,       
        3819, 315,3853,128};
        
        PriorityQueue<Node> q = new PriorityQueue<Node>(n, new Compare()); 
  
        
        for (int i = 0; i < n; i++) { //creating and adding the correct number of nodes
            Node node = new Node(); 
  
            node.c = charArray[i]; 
            node.data = charfreq[i]; 
            node.left = null; 
            node.Right = null; 
            q.add(node); 
        } 
        //header node
 
        Node root = null; 
       
        while (q.size() > 1) { 
        	
  
            Node x = q.peek(); 
            q.poll(); 
            
            Node y = q.peek(); 
            q.poll(); 
            
            Node f = new Node();
            
            f.data = x.data + y.data; // setting data for node F
            f.c = '-'; 
            f.left = x; 
            f.Right = y; 
  
            // marking the f node as the root node. 
            root = f; 
            q.add(f); 
            System.out.println("New Tree Being Developed");
            PrintTree(root, ""); //prints the tree as it is being developed
            
        } 
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like to encode and decode");
        String s = sc.next();
        String answer = encode(s.toLowerCase());
        System.out.println("Encoded:" + answer);
        decode(answer, root );
        
  
        
        
	}
	

}
