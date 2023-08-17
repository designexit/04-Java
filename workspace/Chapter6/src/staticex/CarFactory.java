package staticex;

public class CarFactory {
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Car mySonata = new Car();
//		mySonata.setCarName("나의 소나타");
//		System.out.println(Car.getSerialNum());
//		
//		Car yourSonata = new Car();
//		yourSonata.setCarName("너의 소나타");
//		System.out.println(Car.getSerialNum());
//
//	}
//
//	public static CarFactory getInstance() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Car createCar() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	private static CarFactory instance = new CarFactory();
	private static int carNum = 10000;
	private CarFactory () {}
	public static CarFactory getInstance() {
		return instance;
	}
	public static void setInstance(CarFactory instance) {
		CarFactory.instance = instance;
	}
	public static int getCarNum() {
		return carNum;
	}
	public static void setCarNum(int carNum) {
		CarFactory.carNum = carNum;
	};
	
	public Car createCar() {
		Car car = new Car();
		carNum++;
		car.setCarNum(carNum);
		return car;
	}
	

}
