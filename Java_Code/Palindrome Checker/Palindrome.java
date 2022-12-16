package d140;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 boolean bool = true;
	     
		do{
		System.out.println("Please input a palindrome");
		String a = sc.nextLine();
        System.out.println("Do you want uppercase or lowercase to matter? \nYes or No");
        String c = sc.nextLine();
        String z = a.toLowerCase();
       
     
        switch (c) {
        
        case "no":
        case "No":
        case "n":
        case "N":
        	char [] b = z.toCharArray();// Palindrome will check not check capatilizaion
      		int d = z.length();
      		int PalindromeChecker = 0;
      		
      		
      		
      		for (int i = d-1 , k = 0; i>= 0 || k< d; k++, i--) {
      			
      			
      			if (b[i] != b[k]) {
      				++PalindromeChecker;
      			}

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
		
		
		for (int i = d2-1 , k = 0; i>= 0 || k< d2; k++, i--) {
			
			
			if (p[i] != p[k]) {
				++PalindromeChecker2;
			}

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
		
		System.out.println("Thanks for Playing!");
	}
}

