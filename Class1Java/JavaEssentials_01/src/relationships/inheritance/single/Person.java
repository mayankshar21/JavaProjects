package relationships.inheritance.single;

public class Person {
	private int id;
	private String name;
	private String email;
	protected String mobile;
	
	
	public Person(){
		
	}

	public Person(int id, String name, String email, String mobile) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	//public void setMobile(String mobile) {
    //	  this.mobile = mobile;
	//}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}

	

	
}
