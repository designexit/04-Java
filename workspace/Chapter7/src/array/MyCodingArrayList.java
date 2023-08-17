package array;

import java.util.ArrayList;

public class MyCodingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student("1001", "James"));
		studentList.add(new Student("1002", "Thoma"));
		studentList.add(new Student("1003", "Edward"));
		
		for(int i=0; i<studentList.size(); i++) {
			Student student = studentList.get(i);
			student.showStudentInfo();
		}
		
		System.out.println();
		
		for(Student student : studentList) {
			System.out.println(student.getStudentID() + "," + student.getName());
//			student.showStudentInfo();   ---> Student.java에서 정보가져옴
		}
	}

}
