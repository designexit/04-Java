package array;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [][][] b = {{{1,2},{1,2}},{{3,4},{3,4}}};  ->3차원
		char[][] alphabets = new char[13][2];
		char a = 'a';
			
		for(int i = 0; i < alphabets.length; i++) {
			for(int j=0; j < alphabets[i].length; j++) {
				alphabets[i][j] = a++;
				System.out.print(alphabets[i][j]);
				System.out.print(" ");
			}
			System.out.println();
			
			
		}
		
		
	}

}
