package array;

public class EnhancedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};
		
		int[][] arr = new int [2][3];
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 } };
		
		for(String lang : strArray) {
			System.out.println(lang);
		}
		
//		for(배열의자료형 변수명 : 배열) {
//			실행문;
//		}
		
	}

}
