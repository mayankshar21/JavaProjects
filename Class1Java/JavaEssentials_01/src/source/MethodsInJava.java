package source;

public class MethodsInJava {
	
	public void displayMenu(){
		System.out.println("-- Calculator --");
		System.out.println("1) Add");
		System.out.println("2) Sub");
		System.out.println("3) Mul");
		System.out.println("4) Div");
		System.out.println("5) Quit");
		System.out.println("Your Choice: ");
	}
	
	public int add(int a, int b){
		int result = a + b;
		return result;
	}
	
	public double add(double a, double b){
		double result = a + b;
		return result;
	}
	
	public double add(int a, int b, int c){
		return(a + b + c);
	}
	
	public static void main(String[] args) {
		//create a reference to the class which contains the methods
		MethodsInJava mij = new MethodsInJava();
		mij.displayMenu();//call the method
		
		int res = mij.add(56, 21);
		System.out.println("result: " + res);
		
		System.out.println("result: " + mij.add(3.1, 1.3));
		
		System.out.println("result: " + mij.add(1, 2, 3));
	}

}
