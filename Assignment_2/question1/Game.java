package question1;

public class Game {
	private String title;
	private String genre;
	private int players;

	/*
	 * ===========================================================================
	 * CONSTRUCTORS
	 * ===========================================================================
	 */
	public Game() {}

	public Game(String t, String g, int p) {
		this.setTitle(t);
		this.setGenre(g);
		this.setPlayers(p);
	}

	/*
	 * ============================================================================
	 * INSTANCE METHODS
	 * ============================================================================
	 */
	/* --------------------------Setters----------------------------------------- */
	public void setTitle(String t) {
		this.title = t;
	}

	public void setGenre(String g) {
		this.genre = g;
	}

	public void setPlayers(int p) {
		this.players = p;
	}

	/* --------------------------Getters----------------------------------------- */
	public String getTitle() {
		return this.title;
	}

	public String getGenre() {
		return this.genre;
	}

	public int getPlayers() {
		return this.players;
	}

	/*
	 * ------------------------ Other Methods
	 * ----------------------------------------
	 */
	/**
	 * Returns name using wanted format
	 * 
	 * @return String
	 */
	public String toString() {
		return this.getTitle() + " " + this.getGenre() + " " + this.getPlayers();
	}

	public void print() {
		System.out.println(this.toString());
	}
}