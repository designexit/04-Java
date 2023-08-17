package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String javaStr = new String("java");
		System.out.println("javaStr 문자열 주소 값 : " + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programing is fun!!");
		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));
		
		
		javaStr = buffer.toString();
		System.out.println(javaStr);
		System.out.println("새로 만들어진 javaStr 문자열 주소 값 : " + System.identityHashCode(javaStr));

		
//		String test1 = new String("test");
//		StringBuilder buffer = new StringBuilder();
		
		
		Integer i = 1;
		System.out.println(i.intValue());
		
		int number1 = Integer.valueOf("123"); // --> 문자열을 정수형으로 바꿔줌
//		int number1 = String.valueOf("123");  --> string은 오류남
		System.out.println(number1);
		
		
		Integer num1 = new Integer(100);
		int num2 = 200;
		int sum = num1 + num2; //언박싱
		Integer num3 = num2; //오토박싱
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(sum);
		
		Double d = 3.14;
		d.doubleValue(); //변수 선언 예1
		d.toString(); //변수 선언 예2
		Double.parseDouble("12.3"); //변수 선언 예3
		System.out.println();
		
		
		
		
	}

}
