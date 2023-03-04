package GameDemo;

public class Campaign {
	private int discount;
	private int newPrice;
	public Campaign(int discount, int newPrice) {
		super();
		this.discount = discount;
		this.newPrice = newPrice;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getNewPrice() {
		return newPrice;
	}
	public void setNewPrice(int newPrice) {
		this.newPrice = newPrice;
	}

}
