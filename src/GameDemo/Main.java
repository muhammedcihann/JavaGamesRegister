package GameDemo;


public class Main {
		public static void main(String[] args) {
	BaseCustomerManager customerManager = new CustomerManager(new CheckPersonManager());
	GameManager gameManager = new GameManager();
	SalesManager saleManager = new SummerSales();
	
	Customer customer1 = new Customer (1,"Muhammed" , "Cihan" , "123456789" , "1999");
	Customer customer2 = new Customer (2,"Furkan" , "Ulutaş" , "987654321" , "2001");
	Customer customer3 = new Customer (3,"Ceyda Ceren" , "Yavuz" , "0123456789" , "2001");
	
	Game game1 = new Game (0,"DOTA",100);
	Game game2 = new Game(0,"gtaV",6789);	
	customerManager.add(customer1);
	gameManager.add(game2);
	saleManager.discount(game2);
		}
}
