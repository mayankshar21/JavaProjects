package relationships.dependency;

public class Order {
	
	private String orderId;
	private String item;
	private double prices;
	
	public Order(String orderId, String item, double prices) {
		this.orderId = orderId;
		this.item = item;
		this.prices = prices;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", item=" + item + ", prices=" + prices + "]";
	}
	
	public void doPayment(PaymentProcess pp){
		if(pp.getMode().equals("Credit")){
			System.out.println("Your payment has been successfully completed through Credit");
		}else{
			System.out.println("Your payment has been successfully completed through Debit");
		}
	}
}
