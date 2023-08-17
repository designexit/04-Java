package test;

public class Student implements Comparable<Student> {
	private String studentId;
	private String studentName;

	public Student(String studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.parseInt(studentId);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Student) {
			Student student= (Student) obj;
			if (this.studentId == student.studentId)
				return true;
			else
				return false;
		}
		return false;
	}
	
	@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
//		return (this.memberId - member.getMemberId());
		return this.studentName.compareTo(studentName);
	}
	

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return studentId + " : " + studentName;
	}

}
