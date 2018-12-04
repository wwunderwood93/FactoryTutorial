package model;

public class SedanCar extends Car {

	public SedanCar() {
		super(CarType.SEDAN);
		this.construct();
	}
	
	@Override
	protected void construct() {
		System.out.println("Building sedan car");
	}

}
