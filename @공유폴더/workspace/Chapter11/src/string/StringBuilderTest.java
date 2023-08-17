package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String javaStr = new String("Java");
		System.out.println(javaStr);
		System.out.println("javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!!");
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		
		javaStr = buffer.toString();
		System.out.println(javaStr);
		System.out.println("연결된 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
		
		Integer i = 1;
		System.out.println(i.intValue());
		
		int number1 = Integer.parseInt("123");
		System.out.println(number1);
		
		Integer num1 = new Integer(100);
		int num2 = 200;
		int sum = num1 + num2; // 언박싱
		Integer num3 = num2; //오토박싱
		
		Double d = 3.14;
		d.toString();
		Double.parseDouble("12.3");
		
	}

}
















