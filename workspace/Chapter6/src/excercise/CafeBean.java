package excercise;

public class CafeBean {
	private String cafeName;
	private String coffeeName;
	private int money;
	

	
	public String getCafeName() {
		return cafeName;
	}

	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}

	public String getCoffeeName() {
		return coffeeName;
	}

	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void take(int money) {
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println();
	}

	

}
