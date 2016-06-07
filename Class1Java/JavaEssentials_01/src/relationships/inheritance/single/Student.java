package relationships.inheritance.single;

public class Student extends Person {

	private String programme;
	private String duration;
	
	public Student() {
		super();
	}

	public Student(int id, String name, String email, String mobile, String programme, String duration) {
		super(id, name, email, mobile);
		this.programme = programme;
		this.duration = duration;
	}

	public String getProgramme() {
		return programme;
	}

	public void setProgramme(String programme) {
		this.programme = programme;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Student [programme=" + programme + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}

	
	
	
}
