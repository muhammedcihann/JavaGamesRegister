package GameDemo;

public class WinterSales extends SalesManager{

	public void discount(Game game) {
		System.out.println(game.getName() + " Adlı oyunun kış sezonu indirimli fiyatı:  " + game.getGamePrice()*30/100);
		
	}
}
