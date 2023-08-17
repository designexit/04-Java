package classpart;

public class ShopOrder {
	String orderNum;
	String orderID;
	String orderDate;
	String orderName;
	String orderProductNum;
	String address;
	
	//디폴트
	public ShopOrder (String orderNum, String orderID, String orderDate, String orderName, String orderProductNum, String address) {
		this.orderNum = orderNum;
		this.orderID = orderID;
		this.orderDate = orderDate;
		this.orderName = orderName;
		this.orderProductNum = orderProductNum;
		this.address = address;
	}
	
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderProductNum() {
		return orderProductNum;
	}
	public void setOrderProductNum(String orderProductNum) {
		this.orderProductNum = orderProductNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void show() {
		System.out.println("주문번호 : " + orderNum);
		System.out.println("주문자 아이디 : " + orderID);
		System.out.println("주문날짜 : " + orderDate);
		System.out.println("주문자 이름 : " + orderName);
		System.out.println("주문 상품 번호 : " + orderProductNum);
		System.out.println("배송주소 : " + address);
	}
	
	
}
