package staticex;

public class Student2 {
	private static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String adderess;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}
	public static void serialNum(int serialNum) {
		Student2.serialNum = serialNum;

	}
	

}
