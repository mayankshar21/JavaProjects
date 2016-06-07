package source;

import java.util.Scanner;

public class DecisionConstructs {

	public static void main(String[] args) {
		/* Switch Case
		 * *only used on integer and character variables
		 * */
		int choice;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter choice between 1 and 3: ");
		choice = reader.nextInt();
		
		switch(choice){
		case 1:
			System.out.println("Choice 1 has been selected");
			break;
		case 2:
			System.out.println("Choice 2 has been selected");
			break;
		case 3:
			System.out.println("Goodbye!");
			break;
		default:
			System.out.println("Invalid Choice");
		}
		reader.close();
		
		/* For Loop */
		int count=1;
		for(count=1; count<=10; count=count+1){
			System.out.println(count + " Hello");
		}
		
		/* While Loop */
		count = 1;
		while(count != 10){
			System.out.println(count + " Welcome");
			count++;
		}
		
		/*Do-While Loop */
		count = 11;
		do{
			System.out.println(count + " Java");
			count++;
		}while(count<=10);
		
	}
	
	

}
