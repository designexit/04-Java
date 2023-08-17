package excercise;

public class Cafe {
	private String cafeName;
//	private String coffeeName;
	private int customerCount;
	private int money;
	

	
	public String getCafeName() {
		return cafeName;
	}

	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}
	
	public int getCustomerCount() {
		return customerCount;
	}

	public void setCustomerCount(int customerCount) {
		this.customerCount = customerCount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void buyCoffee(int money) {
		this.money += money;
		customerCount++;
	}
	
//	public void showInfo() {
//		System.out.println();
//	}

	

}
