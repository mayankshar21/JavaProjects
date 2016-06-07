package abstractionAndPolymorphism;

public class Test {

	public static void main(String[] args) {
		//Transport t1 = new Transport(1, "public transport");
		//System.out.println(t1.toString());
		MRT m1 = new MRT(2, "public", 6);
		System.out.println(m1.toString());
		double mrtFare = m1.calFare();
		System.out.println("MRT fare: " + mrtFare);
		System.out.printf("MRT fare: $ %.3f\n", mrtFare);
		
		DoubleDecker dd = new DoubleDecker(3, "private", 45, "North-South", 50);
		double ddFare = dd.calFare();
		System.out.println(dd.toString());
		System.out.println("DoubleDecker Fare: $" + ddFare);
	}
}
