package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentAhn = new Student();
		Student a = new Student(); //클래스 생성 : Student자료형에 a라는 student 클래스를 생성
//		int i = 0;
//		studentAhn.studentName = "안연수";
		studentAhn.setStudentName("안연수");

//		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		studentAhn.showStudentInfo();
	}

}
