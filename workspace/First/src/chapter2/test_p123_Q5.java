package chapter2;

public class test_p123_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 3;
		for (int i=4; i<=7; i++) {
			for(int j=1; j<=i; j++) {
				if(j<=count) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			count--;
			System.out.println(); //행바꿈
		}
		count = 1;
		for(int i=6; i>=4; i--) {
			for(int j=1; j<=i; j++) {
				if(j<=count) {
					System.out.print(" ");
				}else {
					System.out.print("*");				
				}				
			}
			count++;
			System.out.println();
		}
		
	}

}
