package d141;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
public class Game_driver {
	

	static Character a = new Character();
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);

	System.out.println("Hello, Welcome to the Game\nIf you have a character already made press 1\nIf you want to make a new character press 2");
	int ans = sc.nextInt();
	if (ans == 1) {
		System.out.println("What is your First name?");
		String FirstName = sc.next();
		System.out.println("What is your Last name?");
		String LastName = sc.next();
		String FileName = FirstName + LastName +".txt";
		File nFile = new File(FileName);
		Scanner inputFile = new Scanner(nFile);
	
		while (inputFile.hasNext())
		{
		   String str = inputFile.nextLine();
		   System.out.println(str);
		}
		inputFile.close();

	}
	else if (ans == 2) {
		System.out.println("What is your First name?");
		String FirstName = sc.next();
		System.out.println("What is your Last name?");
		String LastName = sc.next();
		String FileName = FirstName + LastName +".txt";
		
		File file = new File("C:/Users/Me/Desktop/directory/" + FileName);
		PrintWriter outputfile = new PrintWriter(FileName);
		
	
		
		System.out.println("Are you a male or female : ");
		String gender = sc.next();
		a.setGender(gender);
		System.out.println("What type of armor would you like? (light, medium, or heavy) : ");
		String armor = sc.next();
		a.setArmor(armor);
		System.out.println("What is your weapon of choice? (dagger, sword, spear) : ");
		String weap = sc.next();
		a.setWeapon(weap);
		
		System.out.println("Gender : " + a.getGender());
		System.out.println("Armor : " + a.getArmor());
		System.out.println("Weapon : " + a.getWeapon());
		System.out.println("Agility : " + a.getAgility());
		System.out.println("Defense : " + a.getDefense());
		
		//save file
		outputfile.println("Gender : " + a.getGender());
		outputfile.println("Armor : " + a.getArmor());
		outputfile.println("Weapon : " + a.getWeapon());
		outputfile.println("Agility : " + a.getAgility());
		outputfile.println("Defense : " + a.getDefense());
		outputfile.close();
		
		
		
	}
	else 
		System.out.println("You have the number 1 and 2\npick one of them");

	
	
	
}
}
