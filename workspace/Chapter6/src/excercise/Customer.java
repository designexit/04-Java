package excercise;

public class Customer {
	private String customerName;
	private String lastOrder;
	private int money;
	
	public Customer(String customerName, int money) {
		this.customerName = customerName;
		this.money = money;
	}
	
	public void take(CafeTest cafe, String lastOrder, int money) {
		this.lastOrder = lastOrder;
		this.money -= money;
		cafe.take(money);
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getLastOrder() {
		return lastOrder;
	}

	public void setLastOrder(String lastOrder) {
		this.lastOrder = lastOrder;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
	

}
