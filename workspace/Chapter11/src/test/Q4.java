package test;

class MyDog {
	String name;
	String type;
	
	public MyDog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type + " " + name ;
	}
}

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDog dog = new MyDog("멍멍이" ,  "진돗개");
		System.out.println(dog);
		
		
	}

}
