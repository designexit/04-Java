package classEx;

//import java.lang*;


public class Testmk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 2;
		
		int plus = a + b;
		int minus = a - b;
		int mult = a * b;
		double div = a / b;
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(mult);
		System.out.println(div);
		
		System.out.println("================");
		
		int plus2 = a += b; //2(b) + 1(a) = 3
		int minus2 = a -= b;
		int mult2 = a *= b; //2 * 1
		int div2 = a /= b;
		System.out.println(plus2);
		System.out.println(minus2);
		System.out.println(mult2);
		System.out.println(div2);
		
		System.out.println("================");
		
		System.out.println(minus + 2);
		System.out.println(minus2 + 2);

		
	}

}
