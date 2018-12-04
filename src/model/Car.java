package model;

public abstract class Car {
	
	private CarType model;

	public Car() {}

	public Car(CarType model) {
		this.errorCheckModel(model);
		this.model = model;
	}
	
	private void errorCheckModel(CarType model) {
		if (model == null) {
			throw new IllegalArgumentException("Car model cannot be null");
		}
	}

	protected abstract void construct();

	public CarType getModel() {
		return this.model;
	}
	
	public void setModel(CarType model) {
		this.errorCheckModel(model);
		this.model = model;
	}

}
