package chapter2;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int dan = 2;
//		int times = 1;
		for (int dan=2; dan<=9; dan++) {
			for(int times=1; times<=9; times++) {
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			System.out.println();
		}

	}

}
