package package1;

public class RunGameMain {

	public static void main(String[] args) {
		System.out.println("Welcome to the game!");
		Character player = new Character("Male", "Human", "Warrior");
		player.damage(10);
		System.out.println(player.getHealth());

	}

}
