package polymorphism;

public class DynamicPolymorphism {

	public void dynamicPolymorphism() {
		System.out.println("This is DynamicPolymorphism class.");
	}
}

class DynamicPolymorphismParent extends DynamicPolymorphism {

	public void dynamicPolymorphism() {
		System.out.println("This is Parent class.");
	}
}

class DynamicPolymorphismChild extends DynamicPolymorphism {

	public void dynamicPolymorphism() {
		System.out.println("This is child class.");
	}
}
