package model;

public class SmallCar extends Car {

	public SmallCar() {
		super(CarType.SMALL);
		this.construct();
	}
	
	@Override
	protected void construct() {
		System.out.println("Building small car");
	}

}
