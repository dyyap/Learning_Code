public class Character
{
	private int agility;
	private int defense;
	private String gender;
	private String armor;
	private String weapon;
	
	public void setGender(String gen)
	{	
		gender = gen;
	}
	public void setArmor(String arm)
	{	
		armor = arm;
	}
	public void setWeapon(String weap)
	{	
		weapon = weap;
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
