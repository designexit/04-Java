package chapter2;

public class test_p123_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		int dan = 2;
//		int times = 1;
		
		for(int dan=2; dan<=9; dan++ ) {
			for(int times = 1; times<=9; times++) {
				dan *= times;
				if(dan >= times) {
					break;
				}
			}
			System.out.println();
		}
		
		
		//1안
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=i; j++) {
				System.out.println(i+ "x" + j + "=" + i*j);
			}
			System.out.println();
		}
		
		
		//2안
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j>i) {
					break;
				}
				System.out.println(i+ "x" + j + "=" + i*j);
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
