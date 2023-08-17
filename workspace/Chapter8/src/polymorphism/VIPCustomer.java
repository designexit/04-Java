package polymorphism;

public class VIPCustomer extends Customer {
//	private int customerID;
//	private String customerName;
//	private String customerGrade;
//	int bonusPoint;
//	double bonusRatio;  ---> 상속
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 아이디는 " + agentID + "입니다.";
	}
	
//	public int calcPrice(int price) {
//		bonusPoint += price * bonusRatio;
//		return price - (int)(price * saleRatio);
//	}  ---> 상속
	
	public int agentID() {
		return agentID;
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
//	public String showCustomerInfo() {
//		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
//	}  ---> 상속
	
	
	
}
