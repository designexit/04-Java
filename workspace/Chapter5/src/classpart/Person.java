package classpart;

public class Person {
	int age;
	String name;
	boolean isMarried;
	int child;
	
	
	public Person() {}
	public Person(int age) {}
	public Person(int age, String name, boolean isMarried, int child) {
		this.age = age;
		this.name = name;
		this.isMarried = isMarried;
		this.child = child;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public int getChild() {
		return child;
	}
	public void setChild(int child) {
		this.child = child;
	}
	
//	public void show() {
//		System.out.println("Name : " + name);
//		System.out.println("Age : " + age);
//		System.out.println("Children : " + child);
//		System.out.println("Marriage : " + isMarried);
//	}
	
}
