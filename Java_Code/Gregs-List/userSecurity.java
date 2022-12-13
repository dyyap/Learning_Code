import java.io.File;
import java.ArrayList;
import java.util.Scanner;


/**
	userSecurity examines the user name and their password to check for validation.
*/

public class userSecurity{
	private final int passLength = 10;
	private ArrayList<String> userNames = new ArrayList<String>();	//ArrayList for userNames in file userNames.txt
	private ArrayList<String> userPass = new ArrayList<String>();	//ArrayList for passwords in file userPasswords.txt

	/**userSecurity constructor
		Fills ArrayList from files.
	*/
	public userSecurity(){
		Scanner s = new Scanner(File(userNames.txt));
		while (s.hasNext()){
			userNames.add(s.next());
		}
		s.close();
		
		Scanner s = new Scanner(File(userPasswords.txt));
		while (s.hasNext()){
			userPasswords.add(s.next());		}
		s.close();
	}

	//Checks to see if user exist. Is called by Access method.
	private int doesUserExist(String name){
		int counter = -1;
		for (String nameCheck:userName){
			counter++;
			if (nameCheck == name){
				return counter;
			}
		}
		
		return -1;
	}

	//Sees if password match the files. Is called by Access method.
	private bool doesPassMatch(int index, String pass){
		if (pass.Length() != passLength) {
			return false;
		}
		
		if (userPass<index> == pass){
			return true;
		}
		else {
			return false;
		}
	}

	//Checks the see if access to user info should be given.
	public bool Access(String name, String pass){
		int arrayIndex = doesUserExist(name);
		bool canAccess;
		if (arrayIndex > -1) {
			canAccess=doesPassMatch(arrayIndex, pass);
			
			if (canAccess == false) {
				System.out.println("User found, but password doen't match!");
				
			}
		}	
		else if (arrayIndex == -1) {
			System.out.println("The user name does not exist.");
		}
		
		return canAccess;
}
