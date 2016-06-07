package relationships.inheritance.single;

/* extends keyword denotes the inheritance relationship */
public class Employee extends Person{
	private String department;
	private double salary;
	
	public Employee() {
		super();//Call to default constructor of person class
		//call to overloaded constructor of person class with literal values
		//super(1, "john", "john@gmail.com", "98871095");  
	}

	/*public Employee(int id, String name, String email, String mobile) {
		super(id, name, email, mobile);
	}*/

	public Employee(int id, String name, String email, String mobile, String department, double salary) {
		//call to overload constructor of person
		super(id, name, email, mobile);
		//initialize values of employee object
		this.department = department;
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [department=" + department + ", salary=" + salary + ", toString()=" + super.toString() + "]";
	}
	
	public void updateMobile(String mobile){
		this.mobile = mobile;
	}
	
}
