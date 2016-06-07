package source;

public class FirstProgram {

	public static void main(String[] args) {
		System.out.println("Welcome to Java Programming");	
		System.out.println("Hello World");
		System.out.println(); //blank line
		System.out.println("Eclipse is great!!!");
		System.out.print("Java");
		System.out.print(" Programming");
		
		/* Data Types & Variables */
		
		/* Identifiers Conventions 
		int my_number;
		int totalcost; int TOTAL_COST;
		int total_cost;
		int totalcost5;
		*/
		int number; //creating a variable of type integer
		number = 500; //assign a value to the variable
		System.out.println();
		System.out.println(number);//check if the value was actually assigned
		System.out.println("number = " + number + " is the value");
		
		//create & assign value to a variable of double data type
		double temperature = 29.56;
		System.out.println("The temperature is: " + temperature);
		
		char mych = '#';
		System.out.println("My favourite character is " + mych);
		
		String greeting = "good morning";
		System.out.println(greeting);
		boolean status = true;
		System.out.println("Current status: " + status);
		
		
	}

}
