package package1;

public class Weapon {
	// Instance Variables
	String material;
	String type;
	int damageAmount;
	
	// Constructor
	public Weapon(String weaponMaterial, String weaponType)
	{
		if (weaponMaterial == "Wood")
		{
			material = "Wood";
			damageAmount = 1;
		}
		if (weaponMaterial == "Iron")
		{
			material = "Iron";
			damageAmount = 3;
		}
	}
}
