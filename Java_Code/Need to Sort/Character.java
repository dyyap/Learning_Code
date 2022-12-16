package d141;
import java.util.Scanner;

//authors: Tyler, Daniel, and David
	
public class Character { 
	private int agility; 
	private int defense; 
	private String gender;
	private String armor;
	private String weapon;
	Scanner kb = new Scanner(System.in);
	private boolean gendans;
	private boolean weaponans;
	private boolean armorans;

	
	
	//gender 
	public void setGender(String gen)
	{	gendans = false;
		do {
		if(gen.equalsIgnoreCase("male"))
		{
			gender = "male";
			gendans = true;
		}
		else if(gen.equalsIgnoreCase("female"))
		{
			gender = "female";
			gendans = true;
		}
		else
		{
			System.out.print("Sorry, I didn't catch that. Are you male or female? : ");
			gen = kb.next();
			
		}
	}while(gendans == false);
	}
	
	//armor 
	public void setArmor(String arm)
	{	armorans = false;
		do {
		
		if(arm.equalsIgnoreCase("light"))
		{
			armor = "light";
			agility = 4;
			defense = 0;
			armorans = true;
		}
		else if(arm.equalsIgnoreCase("medium"))
		{
			armor = "medium";
			agility = 2;
			defense = 2;
			armorans = true;
		}
		else if(arm.equalsIgnoreCase("heavy"))
		{
			armor = "heavy";
			agility = 0;
			defense = 4;
			armorans = true;
		}
		else
		{
			System.out.print("Sorry, I didn't catch that. What type of armor would like? (light, medium, or heavy) : ");
			arm = kb.nextLine();
		}
	}while(armorans == false);
	}
	
	//weapon
	public void setWeapon(String weap)
	{	
		weaponans = false;
		do {
		
		if(weap.equalsIgnoreCase("dagger"))
		{
			weapon = "dagger";
			agility = agility + 2;
			weaponans = true;
		}
		else if(weap.equalsIgnoreCase("sword"))
		{
			weapon = "sword";
			agility = agility + 1;
			defense = defense + 1;
			weaponans = true;
		}
		else if(weap.equalsIgnoreCase("spear"))
		{
			weapon = "spear";
			defense = defense + 2;
			weaponans = true;
		}
		else
		{
			System.out.print("Sorry, I didn't catch that. What is your weapon of choice? (dagger, sword, spear) : ");
			weap = kb.nextLine();
		}
		}while(weaponans == false);
	}
	
	
	public int getAgility()
	{
		return agility;
	}
	public int getDefense()
	{
		return defense;
	}
	public String getArmor()
	{
		return armor;
	}
	public String getWeapon()
	{
		return weapon;
	}
	public String getGender()
	{
		return gender;
	}
	}



