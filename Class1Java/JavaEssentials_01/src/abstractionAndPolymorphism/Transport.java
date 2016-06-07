package abstractionAndPolymorphism;

public abstract class Transport {
	private int id;
	private String type;
	
	
	public Transport(){
		
	}	
	
	public Transport(int id, String type) {
		this.id = id;
		this.type = type;
	}
	
	/* Abstract method to calculate Fare
	 * No Implementation is required.*/
	public abstract double calFare();


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Transport [id=" + id + ", type=" + type + "]";
	}
	
	
}