package chap06;

public class Code01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.kind = "Sonata";
		myCar.color = "White";
		myCar.year = 2015;
		Car yourCar = new Car();
		yourCar.kind = "Pride";
		yourCar.color = "blue";
		yourCar.year = 2017;
		myCar.run();
		yourCar.run();
		myCar.speedUp();
		yourCar.speedUp();
	}

}
