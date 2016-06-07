package relationships.association;

public class test {

	public static void main(String[] args) {
		Account acc1 = new Account("Acc101", "Savings", 15000);
		System.out.println(acc1.toString());
		
		Customer c1 = new Customer(1, "John");
		c1.getAccountList().add(acc1);
		c1.getAccountList().add(new Account("Acc102", "Current", 20000));
		
		/*For Each Loop*/
		System.out.println("----------------------------");
		for(Account a: c1.getAccountList()){
			System.out.println(a.toString());
		}
		
		System.out.println("-- Customer Info --");
		System.out.println(c1.toString());
	}

}
