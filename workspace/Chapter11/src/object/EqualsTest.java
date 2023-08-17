package object;

class Student {
	int studentId;
	String studentName;

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public String toString() {
		return studentId + "," + studentName;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId)
				return true;
			else return false;
		}
		return false;
	}
	
	
	@Override
	public int hashCode() {
		return studentId;
	}

//	private int studentId() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}



public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee; //주소복사
		Student studentSang = new Student(100, "이상원");

		if (studentLee == studentLee2) // 주소값을 비교
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");

		if (studentLee.equals(studentLee2))
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		else
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		
		if(studentLee == studentSang) // 주소값을 비교 : new로 다른 주소 생성되어 동일하지 않음
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
		
		if(studentLee.equals(studentSang))
			System.out.println("studentLee와 studentSang는 동일합니다.");
		else
			System.out.println("studentLee와 studentSang는 동일하지 않습니다.");
		
		
		System.out.println("studentLee의 hashCode : " + studentLee.hashCode());
		System.out.println("studentSang의 hashCode : " + studentSang.hashCode());
		
		System.out.println("studentLee의 실제 주소값 : " + System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소값 : " + System.identityHashCode(studentSang));
		
		System.out.println(studentLee);
		System.out.println(studentSang);
		
	}

}
