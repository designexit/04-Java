package test;

import java.util.ArrayList;

public class DogArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Dog> dogList = new ArrayList<Dog>();

		dogList.add(new Dog("리온", "말티즈"));
		dogList.add(new Dog("하루", "푸들"));
		dogList.add(new Dog("보리", "치와와"));
		dogList.add(new Dog("냥냥", "포메라이언"));
		dogList.add(new Dog("호두", "골든리트리버"));

//		for (int i = 0; i < dogList.size(); i++) {
//			Dog dog = dogList.get(i);
//			dog.showDogInfo();
//		}

		for (Dog dog : dogList) {
			System.out.println(dog.showDogInfo());
		}

	}

}
