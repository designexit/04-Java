package classpart;

public class Student3 {
	int studentID;
	String studentName;
	Subject korean;
	Subject math;
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
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
		System.out.println(studentName);
		System.out.println(korean.scorePoint);
		System.out.println(korean.subjectName);
		System.out.println(math.scorePoint);
		System.out.println(math.subjectName);
	}
	
	
	
	
	
	
	
	
	
	
	
}
