package classEx;

public class Person {
	String name;
	String address;
	int phoneNum;
	
	public Person(String name, String address, int phoneNum) {
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
				
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

}
