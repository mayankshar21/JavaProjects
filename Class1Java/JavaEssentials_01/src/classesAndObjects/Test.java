package classesAndObjects;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person(); //create an object of type person
		/*p1.id = 1;
		p1.name = "John";
		p1.email = "john@gmail.com";
		p1.mobile = "98871095";
		
		System.out.println(p1.id + " " + p1.name);*/
		
		p1.setId(101);
		p1.setName("John Smith");
		p1.setEmail("john@gmail.com");
		p1.setMobile("98871095");
		
		System.out.println(p1.toString());
		
		Person p2 = new Person(102, "Paul");
		p2.setEmail("paul@gmail.com");
		p2.setMobile("98871095");
		System.out.println(p2.toString());
		
		Person p3 = new Person(103, "Sally", "sally@gmail.com", "98871095");
		System.out.println(p3.toString());
		
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		
		//show Details of persons in the list
		System.out.println("--- Person Info ---");
		for(Person p: personList){
			System.out.println(p.toString());
		}

	}

}
