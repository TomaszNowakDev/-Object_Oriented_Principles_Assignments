package question1;

public class TestGame {

	public static void main(String[] args) {
		Game game1 = new Game();// we initialise the object game1 of class Game.
		game1.setTitle("Call of Duty"); // we set the value of the title attribute
		game1.setGenre("Action");
		game1.setPlayers(3);
		game1.print();
		Game gm2 = new Game("Mines", "Puzzle", 3);
		gm2.print();

	}

}
