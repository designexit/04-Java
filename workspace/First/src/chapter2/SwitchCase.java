package chapter2;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ranking = 5;
		char medalColor;

		switch (ranking) {
		case 1: case 4: case 5:
			medalColor = 'G';
			break;
		case 2:
			medalColor = 'S';
			break;
		case 3:
			medalColor = 'B';
			break;
		default:
			medalColor = 'A';

		}
		System.out.println(ranking + "등 메달의 색깔은" + medalColor + "입니다.");

	}

}

