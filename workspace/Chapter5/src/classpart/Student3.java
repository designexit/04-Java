package classpart;

public class Student3 {
	int studentID;
	String StudentName;
	Subject korean;
	Subject math;
	
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public Subject getKorean() {
		return korean;
	}
	public void setKorean(Subject korean) {
		this.korean = korean;
	}
	public Subject getMath() {
		return math;
	}
	public void setMath(Subject math) {
		this.math = math;
	}
	
	public void showStudent3() {
		System.out.println(studentID);
		System.out.println(StudentName);
		System.out.println(korean);
		System.out.println(math);
		
	}
	
//	public void setKorean(String string, int i) {
//		// TODO Auto-generated method stub
//		
//	}
	
	

}
