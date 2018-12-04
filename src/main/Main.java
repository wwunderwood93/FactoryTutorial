package main;
import factory.CarFactory;
import model.CarType;

public class Main {

	public static void main(String[] args) {
		CarFactory.buildCar(CarType.SMALL);
		CarFactory.buildCar(CarType.SEDAN);
		CarFactory.buildCar(CarType.LUXURY);
	}

}
