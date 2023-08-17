package thisex;

class Person {
	String name;
	int age;
	
	Person(){
//		System.out.println(); -> *this위에 아무것도 적지 않음
		this("Nova", 6);
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
		System.out.println(p.name);
		System.out.println(p.age);

	}

}
