package chapter2;

import java.util.Random;
import java.util.Scanner; //ctrl+shift o

// 들여쓰기 c+s+f

public class game1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드 타이핑을 받아오는 방법
		Scanner s = new Scanner(System.in); // 키보드 입력을 위한 클래스 선언
		String str = s.nextLine(); // 키보드에서 입력한 값을 변수에 저장
		// 랜덤 숫자를 받아오는 방법

		Random r = new Random(); // 랜덤 숫자 출력을 위한 클래스 선언
		int computerNum = r.nextInt(3); // 0~2까지의 랜덤 숫자
		String computer = "";
		if(computerNum == 0) {
			computer = "가위";
		}else if(computerNum == 1) {
			computer = "바위";
		}else{
			computer = "보";
		}

//		System.out.println(computer);
//		if (str.equals(computer)) {
//			System.out.println("비겼습니다");
//		}else if (str.equals(computer)) {
//			System.out.println("이겼습니다");
//		}else {
//			System.out.println("졌습니다");
//		}
//		
		System.out.println(computer);
		if (str.equals(computer)) {
			System.out.println("비겼습니다");
		}else if ((str.equals("가위") && computer.equals("보"))
					||(str.equals("바위") && computer.equals("가위"))
					||(str.equals("보") && computer.equals("바위"))) {
			System.out.println("이겼습니다");
		}else {
			System.out.println("졌습니다");
		}
		
		
		
		
//		System.out.println(computerNum);				
//		String computer = "가위";
//		if (str.equals("가위")) {
//			if (computer.equals("가위")) {
//				System.out.println("비겼습니다");
//			}
//		} else if (str.equals("바위")) {
//			if (computer.equals("가위")) {
//				System.out.println("이겼습니다");
//			}
//		} else {
//			if (computer.equals("보")) {
//				System.out.println("졌습니다");
//			}
//		}
//		else if(str.equals("바위")) {
//			if(computer.equals("가위")){
//				System.out.println("이겼습니다");	
//			}else if(computer.equals("바위")) {
//				System.out.println("비겼습니다");
//			}else {
//				System.out.println("졌습니다");
//			}
//		}else {
//			if(computer.equals("보")){
//				System.out.println("이겼습니다");	
//			}else if(computer.equals("바위")) {
//				System.out.println("졌습니다");
//			}else {
//				System.out.println("비겼습니다");
//			}
//		}
//		

	}

}