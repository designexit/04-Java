package classpart;

public class OrderInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopOrder order1 = new ShopOrder("201803120001", "abc123", "2018년 3월 12일", "홍길순", "PD0345-12", "서울시 영등포구 여의도동 20번지");

//		order1.orderNum = "201803120001";
//		order1.orderID = "abc123";
//		order1.orderDate = "2018년 3월 12일";
//		order1.orderName = "홍길순";
//		order1.orderProductNum = "PD0345-12";
//		order1.address = "서울시 영등포구 여의도동 20번지";
		
		order1.show();

	}

}
