package relationships.association;

import java.util.ArrayList;

public class Customer {
	private int id;
	private String name;
	private Account account; //1 to 1 association
	
	//1 to many Association
	
	private ArrayList<Account> accountList = new ArrayList<Account>();
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public ArrayList<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", account=" + account + ", accountList=" + accountList + "]";
	}

	
}
