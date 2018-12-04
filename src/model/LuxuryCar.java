package model;

public class LuxuryCar extends Car {

	public LuxuryCar() {
		super(CarType.LUXURY);
		this.construct();
	}
	
	@Override
	protected void construct() {
		System.out.println("Building luxury car");
	}

}
