package relationships.dependency;

public class PaymentProcess {
	
	private String mode;

	public PaymentProcess(String mode) {
		this.mode = mode;
	}

	@Override
	public String toString() {
		return "PaymentProcess [mode=" + mode + "]";
	}

	public String getMode() {
		return mode;
	}
}
