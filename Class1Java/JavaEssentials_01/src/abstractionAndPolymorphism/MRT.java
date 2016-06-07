package abstractionAndPolymorphism;

public class MRT extends Transport {
	private int numOfCarriages;

	public MRT() {
		super();
		
	}

	public MRT(int id, String type, int numOfCarriages) {
		super(id, type);
		this.numOfCarriages = numOfCarriages;
	}

	public int getNumOfCarriages() {
		return numOfCarriages;
	}

	public void setNumOfCarriages(int numOfCarriages) {
		this.numOfCarriages = numOfCarriages;
	}

	@Override
	public String toString() {
		return "MRT [numOfCarriages=" + numOfCarriages + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calFare() {
		double fare = 0.05 * numOfCarriages / 4;
		return fare;
	}
	
	
}
