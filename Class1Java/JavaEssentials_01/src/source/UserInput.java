package source;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);//invoke the scanner object
		System.out.println("What is your name? ");
		String userName = reader.nextLine();
		System.out.println("Hello " + userName);	
		
		System.out.println("Enter your age: ");
		int age = reader.nextInt();
		System.out.println("You have enterer : " + age);
		
		System.out.print("What is the temp in your city today? ");
		double temp = reader.nextDouble();
		System.out.println(temp + " is the temp in my city today.");
		
		System.out.println("What character do you like? ");
		char mych = reader.next().charAt(0);
		System.out.println("The character is: " + mych);
		reader.close(); //close the scanner object

	}

}
