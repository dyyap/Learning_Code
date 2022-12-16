package cs241;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Driver {
	private static boolean flag = true;

	public static void main(String args[]) {
		BinarySearchTree<Integer> Searcher = new BinarySearchTree<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the initial sequence of values:");
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		int count = st.countTokens();

		for(int x = 0;x < count;x++){
	        Searcher.add(Integer.parseInt((String)st.nextElement()));
	    }
		

		Searcher.preorderTraverse();
		System.out.println();
		Searcher.inorderTraverse();
		System.out.println();
		Searcher.postorderTraverse();
		System.out.println();
		
		
		do {
		System.out.println("Command?");
		String a = sc.nextLine();
		if (a == "H") {
			 System.out.println(" I  Insert a value\n D  Delete a value\n P  Find a predecessor\n S  Find Successor\n E  Exit the Program\n H  Display This message");
					break;}
			
		if (a.contains("I")) {
			char [] b = a.toCharArray();
			StringBuilder sb = new StringBuilder();
			sb.append(b[2]);
			sb.append(b[3]);
			String sb2 = sb.toString();
			int ty = Integer.parseInt(sb2);
			if (Searcher.contains(ty))
			{System.out.println(ty + " already exists");}
			else
			Searcher.add(ty);
			
			Searcher.inorderTraverse();
			System.out.println();
		}
		
		if (a.contains("D")) {
			char [] c = a.toCharArray();
			StringBuilder sb = new StringBuilder();
			sb.append(c[2]);
			sb.append(c[3]);
			String sb2 = sb.toString();
			int ty = Integer.parseInt(sb2);
			if (!Searcher.contains(ty))
			{System.out.println(ty + " does not exist");}
			else
			Searcher.delete(ty);
			
			Searcher.inorderTraverse();
			System.out.println();
			
		}
		if (a.contains("S")) {
			char [] c = a.toCharArray();
			StringBuilder sb = new StringBuilder();
			sb.append(c[2]);
			sb.append(c[3]);
			String sb2 = sb.toString();
			int ty = Integer.parseInt(sb2);
			Searcher.getSuccessor(ty);
			 
			
		}
	
		}while (flag = true);
		
		
		
	
	
	}
}

