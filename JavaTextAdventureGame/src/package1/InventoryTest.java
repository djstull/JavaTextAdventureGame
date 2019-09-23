package package1;

public class InventoryTest {
	public static void main(String args[])
	{
		Inventory charInventory = new Inventory(0);
		charInventory.addItem("Jibblets");
		System.out.println(charInventory.getContents());
		charInventory.addItem("Salad");
		System.out.println(charInventory.getContents());
		charInventory.removeItem("Salad");
		System.out.println(charInventory.getContents());
	}
}
