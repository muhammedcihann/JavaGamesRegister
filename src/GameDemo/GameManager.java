package GameDemo;

public class GameManager extends BaseGameManager{
	
	public void delete(Game game) {
		
		System.out.println("Oyun Silindi:" + game.getName());

	}

	
	public void update(Game game) {
		System.out.println("Oyun Güncellendi");

	}

	
	public void add(Game game) {
		System.out.println("Oyun Eklendi: " + game.getName());
	}
}
