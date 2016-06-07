package relationships.inheritance.multilevel;

public class TestMultilevelInheritance {

	public static void main(String[] args) {
		DoubleDecker dd = new DoubleDecker(1, "Bus", 45, "Woodlands to Marina Bay", 1000.00);
		System.out.println(dd.toString());
	}

}