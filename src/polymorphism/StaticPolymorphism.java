package polymorphism;

public class StaticPolymorphism {

	public void addition(int a, int b) {
		
		int addition=a+b;
		System.out.println("Addition with two parameter is : "+addition);
	}
	
	public void addition(int a, int b, int c) {
		
		int addition=a+b+c;
		System.out.println("Addition with three parameter is : "+addition);
	}
	
	public void addition(double a, int b, int c) {
		
		double addition=a+b+c;
		System.out.println("Addition with double parameter is : "+addition);
	}
}
