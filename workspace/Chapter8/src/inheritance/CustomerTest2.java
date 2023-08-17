package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer vc = new VIPCustomer(0, null, 0);
		//VIPCustomer vc2 = new Customer(0, null); --> 상위 상속자를 하위상속으로 불러올 수 없음
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 1001);
//		customerKim.setCustomerID(10020);
//		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		System.out.println(customerKim.showVIPInfo());

	}

}
