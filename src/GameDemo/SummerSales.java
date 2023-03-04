package GameDemo;

public class SummerSales extends SalesManager{
	public void discount(Game game) {
		System.out.println(game.getName() + " Adlı oyunun yaz sezonu indirimli fiyatı:  " + game.getGamePrice()*50/100)  ;
		
	}
}
