package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2; //int는 정수값만.. int로 변환 1+0=1
		int iNum4 = (int)(dNum1 + fNum2); // 1.2+0.9=2.1 -> int로 정수변환해서 2
		System.out.println(iNum3);
		System.out.println(iNum4);
	}

}
