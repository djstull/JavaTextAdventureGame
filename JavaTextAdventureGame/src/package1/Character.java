package package1;

public class Character {
	// Instance Variables
	int hp;
	int mp; // Does nothing currently, mana will be added at a later point.
	
	// Constructor
	public Character(String gender, String race, String job)
	{
		hp = 100;
		mp = 0; // Mana will be added at a later point.
	}
	
	// Methods
	
	// Return Methods
	public int getHealth()
	{
		return hp;
	}
	
	public int getMana()
	{
		return mp;
	}
	
	// Deals damage to the character.
	public void damage(int damageDealt)
	{
		hp -= damageDealt;
	}
	
	// Heals the character.
	public void heal(int damageRemoved)
	{
		hp += damageRemoved;
	}
}
