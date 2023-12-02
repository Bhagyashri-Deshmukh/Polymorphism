package polymorphism;

public class PolymorphismTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This is static polymorphism
		StaticPolymorphism staticPolymorphism = new StaticPolymorphism();
		staticPolymorphism.addition(10, 15);
		staticPolymorphism.addition(20, 10, 30);
		staticPolymorphism.addition(10.20, 10, 40);
		
		System.out.println("-------------------------------------------------------------");
		
		// This is dynamic polymorphism
		DynamicPolymorphism dynamicPolymorphism;
		
		dynamicPolymorphism = new DynamicPolymorphismParent();
		dynamicPolymorphism.dynamicPolymorphism();
		
		dynamicPolymorphism = new DynamicPolymorphismChild();
		dynamicPolymorphism.dynamicPolymorphism();
	}

}
