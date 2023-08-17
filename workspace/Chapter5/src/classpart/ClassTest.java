package classpart;

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student3 s3 = new Student3();
		s3.setStudentID(1);
		s3.setStudentName("이름");
		
		s3.setKorean(new Subject("국어", 90));
		s3.setMath(new Subject("수학", 80));
		
		s3.showStudent3();
		

	}

}
