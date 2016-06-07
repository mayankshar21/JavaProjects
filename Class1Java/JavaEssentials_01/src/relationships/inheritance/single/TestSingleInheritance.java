package relationships.inheritance.single;

public class TestSingleInheritance {

	public static void main(String[] args) {
		Person p1 = new Person(1, "John", "john@gmail.com", "98871095");
		System.out.println(p1.toString());
		
		Employee emp1 = new Employee(2, "Kam", "kam@yahoo.com", "98711059", "FIN", 4000);
		System.out.println(emp1.toString());
		emp1.setEmail("mayankshar21@gmail.com");
		System.out.println(emp1.toString());
		emp1.updateMobile("96701044");
		System.out.println(emp1.toString());
		
		Student st1 = new Student(3, "Mayank", "mayankshar21@yahoo.com.sg", "98871095", "Engineering", "30days");
		System.out.println(st1.toString());
	}

}
