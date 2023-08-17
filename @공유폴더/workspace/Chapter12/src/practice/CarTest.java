package practice;

import java.util.HashMap;

class CarFactory{
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	
	private  HashMap<String, Car> hashMap  = new HashMap<String, Car>();
	
	public static CarFactory getInstance() {
		return instance;
	}
	public Car createCar(String name) {
		Car car;
		if(hashMap.containsKey(name)){
			return car = hashMap.get(name);
		}
		car = new Car(name);
		hashMap.put(name, car);
		return car;
	}
}


class Car{
	String name;
	public Car() {}
	public Car(String name) {
		this.name = name;
	}
}

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory factory = CarFactory.getInstance();
		Car sonata1 = factory.createCar("연수 차");
		Car sonata2 = factory.createCar("연수 차");
		System.out.println(sonata1 == sonata2);//true
		
		Car avante1 = factory.createCar("승연 차");
		Car avante2 = factory.createCar("승연 차");
		System.out.println(avante1 == avante2);//true
		
		System.out.println(sonata1 == avante1);//false
		
	}

}
