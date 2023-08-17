package test;

class Alpha {
	String a;
	String b;
	
	public Alpha(String a, String b) {
		this.a = a;
		this.b = b;
	}
	
	public String toString() {
		return a + b;
	}
}

public class Q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a = new String("abc");
//		String b = new String("def");
//		String a2 = a;
//		String b2 = b;
////		String a = a+b;
//		
//		System.out.println(a2+b2);
		
		Alpha alpha = new Alpha("abc" , "def");
		System.out.println(alpha);
		

	}

}
