package source;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		double a;
		double b;
		double result;
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter value of a: ");
		a = reader.nextDouble();
		System.out.print("Enter value of b: ");
		b = reader.nextDouble();
		
		System.out.println("-- Calculation Result --");
		result = a + b;
		System.out.println(a + " + " + b + " = " + result);
		
		result = a - b;
		System.out.println(a + " - " + b + " = " + result);
		
		result = a * b;
		System.out.println(a + " * " + b + " = " + result);
		
		result = a / b;
		System.out.println(a + " / " + b + " = " + result);
		
		result = a % b;
		System.out.println(a + " % " + b + " = " + result);
		
		/* Logical Operators */
		if(a > 0){
			System.out.println(a + " is positive");
		}
		
		if(a > 0){
			System.out.println(a + " is positive");
		}else{
			System.out.println(a + " is negative");
		}
		
		if(a == 0){
			System.out.println("0 value is not allowed");
		}else if(a > 0){
			System.out.println(a + " is positive");
		}else{
			System.out.println(a + " is negative");
		}
		System.out.print("Enter your age: ");
		int age = reader.nextInt();
		
		if(age<=0 || age > 120){
			System.out.println("Invalid Age");
		}else if(age >= 1 && age <= 12){
			System.out.println("Welcome to Kids Corner");
		}else if(age >= 13 && age <= 20){
			System.out.println("Welcome to Teen World");
		}else{
			System.out.println("Adults are not allowed!");
		}
		
		reader.close();

	}

}
