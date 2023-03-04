package GameDemo;

public class Game {
	private int id;
	private String name;
	private int gamePrice;
	
	public Game(int id, String name, int gamePrice) {
		super();
		this.id = id;
		this.name = name;
		this.gamePrice = gamePrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}
	
}
