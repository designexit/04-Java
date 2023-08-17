package test;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog[] dogs = new Dog[5];
		
		dogs[0] = new Dog("리온", "말티즈");
		dogs[1] = new Dog("하루", "푸들");
		dogs[2] = new Dog("보리", "치와와");
		dogs[3] = new Dog("냥냥", "포메라이언");
		dogs[4] = new Dog("호두", "골든리트리버");
		
		for(int i=0; i<dogs.length; i++) {
			System.out.println(dogs[i].showDogInfo());
		}
		
		for(Dog dog : dogs) {
			System.out.println(dog.showDogInfo());
		}


	}

}
