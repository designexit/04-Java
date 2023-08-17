package operator;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myAge = 23;
		int teacherAge = 38;
		
		boolean value = (myAge > 25);
		System.out.println(value);
		
		System.out.println(myAge <= 25);
		System.out.println(myAge);
		
		char ch;
		ch = (myAge > teacherAge) ? 'T' : 'F';
		
		
		
		int num;
		num = -5 + 3 * 10 / 2;
		System.out.println(num);
		
		int num2 = 10;
		System.out.println(num2);
		System.out.println(num2++);
		System.out.println(num2);
		System.out.println(--num2);
		
		int num3 = 10;
		int num4 = 20;
		boolean result;
		
		result = ((num3 > 10) && (num4 > 10));
		System.out.println(result);
		result = ((num3 > 10) || (num4 > 10));
		System.out.println(result);
		System.out.println(!result);
		
		int num5 = 2;
		int num6 = 10;
		
		System.out.println(num5 & num6);
		System.out.println(num5 | num6);
		System.out.println(num5 ^ num6);
		System.out.println(~num5);
		
		int num7 = 8;
		System.out.println(num7 += 10); 
		System.out.println(num7 -= 10);
		System.out.println(num7 >>= 2);
		
		int num8 = 10;
		int num9 = 20;
		
		int result2 = (num8 >= 10) ? num9 + 10 : num9 - 10;
		System.out.println(result2);


	}

}
