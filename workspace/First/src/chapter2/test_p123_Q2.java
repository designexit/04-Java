package chapter2;

public class test_p123_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int dan = 2;
//		int times = 1;
		
//		for(int dan=2; dan<=9; dan++) {
//			if(dan % 2 == 0) {
//				for(int times=1; times<=9; times++) {
//					System.out.println(dan + "X" + times + "=" + dan*times);
//				}
//				continue;
//			}
//		}
//		System.out.println();
		
		
		for(int i=2; i<=9; i++) {
			if(i%2 == 1) {
				continue;
			}
			for(int j=1; j<=9; j++) {
				System.out.println(i+ "x" + j + "=" + i*j);
			}
			System.out.println();
		}
		
		

	}

}
