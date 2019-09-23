package package1;

public class Inventory {
	// Instance Variables
	String contents;
	
	// Constructor
	public Inventory(int charID)
	{
		contents = "";
	}
	
	// Methods
	
	// Return Methods
	public String getSlot(int slotNumber)
	{
		return null; // Will eventually scan the inventory for the item in the corresponding slot.
	}
	public String getContents()
	{
		return contents;
	}
	
	// Void Methods
	public void addItem(String item)
	{
		contents += item;
	}
	public void removeItem(String item)
	{
		contents.replace(item, ""); // Not working
	}
	
}
