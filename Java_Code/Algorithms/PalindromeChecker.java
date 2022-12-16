package sdfghjk;

import java.util.Scanner;

//Daniel Yap
//CS240


public class PalindromeChecker {

	private Scanner sc;

	public String Check()
		{
			ArrayStack<Character> PalindromeLineForwards = new ArrayStack<>();
			ArrayStack<Character> PalindromeLineBackwards = new ArrayStack<>();
			sc = new Scanner(System.in);
			boolean bool = true;
		     
			do{
			System.out.println("Please input a palindrome");
			String a = sc.nextLine();
	        System.out.println("Do you want uppercase or lowercase to matter? \nYes or No");
	        String c = sc.nextLine();
	        String z = a.toLowerCase();
	       
	     
	        int PalindromeChecker = 0;
			switch (c) {
	        
	        case "no":
	        case "No":
	        case "n":
	        case "N":
	        	char [] b = z.toCharArray();
	        	int d = z.length();
	        	// Palindrome will check not check capatilizaion
	      		for (int c1 = 0; c1<z.length();c1++) {
	      			PalindromeLineForwards.push(b[c1]); // creates stack forwards
	      			System.out.println(PalindromeLineForwards.peek());}
	      		for (int d1 = d - 1; d1>-1;d1--) {
		      		PalindromeLineBackwards.push(b[d1]);
		      		System.out.println(PalindromeLineBackwards.peek());}// creates stack backwards
	 
	      			while(!PalindromeLineForwards.isEmpty()) {
	      			if (PalindromeLineForwards.peek() != PalindromeLineBackwards.peek()) {
	      				++PalindromeChecker;
	      				System.out.println(PalindromeLineForwards.peek());
	      				System.out.println(PalindromeChecker);
	      				System.out.println(PalindromeLineBackwards.peek());
	      				
	      			}
	      			PalindromeLineForwards.pop();
      				PalindromeLineBackwards.pop();
	      			}
	      			
	      			
	      				
	      		if (PalindromeChecker != 0) {
	      			System.out.println(a + " is not a Palindrome");}
	      		
	      			else 
	      				System.out.println(a + " is a Palindrome");
	      		System.out.println("Would you like to play again? \n(Y or N)"); // repeater
	            
	            
	            
		      break;
		   case "Y":
		   case "Yes": 	   
		   case "y":
		   case "yes":
		    char [] p = a.toCharArray(); // Palindrome will check capatilization
		    int d2 = z.length();
	  		int PalindromeChecker2 = 0;
	  		for (int c1 = 0; c1<z.length();c1++) {
      			PalindromeLineForwards.push(p[c1]); // creates stack forwards
      			System.out.println(PalindromeLineForwards.peek());}
      		for (int d1 = d2 - 1; d1>-1;d1--) {
	      		PalindromeLineBackwards.push(p[d1]);
	      		System.out.println(PalindromeLineBackwards.peek());}// creates stack backwards
 
      		while(!PalindromeLineForwards.isEmpty()) {
      			if (PalindromeLineForwards.peek() != PalindromeLineBackwards.peek()) {
      				++PalindromeChecker2;
      			}
      			PalindromeLineForwards.pop();
  				PalindromeLineBackwards.pop();
      			}
			if (PalindromeChecker2 != 0) {
				System.out.println(a+ " is not a Palindrome");}
			
				else 
					System.out.println(a + " is a Palindrome");
			System.out.println("Would you like to play again? \n(Y or N)");
		

	        
		}String aaa = sc.nextLine();//repeater
		    char abb = aaa.charAt(0);
		    switch (abb)
		    {
	    
	    case 'N':
	    case 'n':
	    	bool = false;
		break;

		    }}while (bool == true);
			
			return("Thanks for Playing!");
			
		}
	}



