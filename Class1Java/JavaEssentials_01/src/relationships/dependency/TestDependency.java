package relationships.dependency;

import java.util.Scanner;

public class TestDependency {

	public static void main(String[] args) {
		PaymentProcess credit = new PaymentProcess("Credit");
		PaymentProcess debit = new PaymentProcess("Debit");
		
		Order ord = new Order("O101", "Bag", 3500);
		
		Scanner reader = new Scanner(System.in);
		System.out.println("-- Select Payment Mode --");
		System.out.println("a) Credit");
		System.out.println("b) Debit");
		System.out.println("Your Choice: ");
		char choice = reader.next().charAt(0);
		
		//if(choice == 'a' || choice == 'A')
		/*String choice = reader.next();
		if(choice.equalsIgnoreCase("a")){
			
		}*/
		switch(choice){
		case 'a':
			ord.doPayment(credit);
			break;
		case 'b':
			ord.doPayment(debit);
			break;
			default:
				System.out.println("Invalid Option");
		}
		reader.close();
	}

}
