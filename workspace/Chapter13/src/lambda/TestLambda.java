package lambda;

interface PrintString {
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("hello lambda_1");
		showMyString(lambdaStr);
		
		PrintString reStr = returnString();
		reStr.showString("hello");
	}
	public static void showMyString(PrintString p) {
		p.showString("hello lambda_2");
	}
	
	public static PrintString returnString() {
		PrintString str = s -> System.out.println(s + "world");
//		return str;
		
		return s -> System.out.println(s + "world");
	}
	

}
