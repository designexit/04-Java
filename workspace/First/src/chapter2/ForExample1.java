package chapter2;

public class ForExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i;
//		int sum;
//		for (i = 1, sum = 0; i <= 10; i++) {
//			sum += i;
//		}
		
		// 조건식 생략
//		int i = 1;
//		int sum = 0;
//		for (; i <= 10; i++) {
//			sum += i;
//		}
//		
		int i = 1;
		int sum = 0;
		for (;;) {
			if(i>=10) {
				break;
			}
			 
			i = i+1;
			sum += i;
		}
		
		System.out.println("1부터 10까지의 합은" + sum + "입니다.");
	}

}
