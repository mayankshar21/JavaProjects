package relationships.inheritance.multilevel;

public class Bus extends Transport {
	private int noOfPassengers;
	private String route;
	
	public Bus() {
		super();
	}
	
	public Bus(int id, String type, int noOfPassengers, String route) {
		super(id, type);
		this.noOfPassengers = noOfPassengers;
		this.route = route;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	@Override
	public String toString() {
		return "Bus [noOfPassengers=" + noOfPassengers + ", route=" + route + ", toString()=" + super.toString() + "]";
	}
	
	
}
