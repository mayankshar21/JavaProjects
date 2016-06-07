package relationships.inheritance.multilevel;

public class DoubleDecker extends Bus {
	private double fuelCapacity;

	public DoubleDecker() {
		super();
	}

	public DoubleDecker(int id, String type, int noOfPassengers, String route, double fuelCapacity) {
		super(id, type, noOfPassengers, route); //Calls the overloaded constructor of Bus
		this.fuelCapacity = fuelCapacity;
	}

	public double getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	@Override
	public String toString() {
		return "DoubleDecker [fuelCapacity=" + fuelCapacity + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
