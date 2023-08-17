package test;

import java.util.HashMap;

public class CarFactory {
	private static CarFactory instance = new CarFactory();
	HashMap<String, Car> hashMap = new HashMap<>();
	
	private CarFactory() {}
	public static CarFactory getInstance() {
		
		if (instance == null)
			instance = new CarFactory();
		return instance;
	}
	
	public Car createCar(String carName) {
		if( hashMap.containsKey(carName) ) {
			return hashMap.get(carName);
		}
		Car car = new Car(carName);
		hashMap.put(carName, car);
		return car;
	}
}
