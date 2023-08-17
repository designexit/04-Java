package test;

public class Test {
	
	//배열

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] studentID = new int[10];
		studentID[0] = 10;
		studentID[1] = 10;
		studentID[2] = 10;
		studentID[3] = 10;
		studentID[4] = 10;
		studentID[5] = 10;
		studentID[6] = 10;
		studentID[7] = 10;
		studentID[8] = 10;
		studentID[9] = 10;
		System.out.println(studentID.length); //length:배열의 개수 확인
		int[] studentID2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		// int[] studentID2 = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};  ->  new int[]만 생략. 위와 비슷하지만 비추천

	}

}
