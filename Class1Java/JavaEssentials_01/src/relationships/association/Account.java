package relationships.association;

public class Account {
	private String accId;
	private String type;
	private double balance;
	
	public Account(String accId, String type, double balance) {
		this.accId = accId;
		this.type = type;
		this.balance = balance;
	}
	
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", type=" + type + ", balance=" + balance + "]";
	}
	
	
	
}
