package superclass_inheritance_test;

public class WorkWithAnimals {
	public static void main(String[] args) {
		Dog fido = new Dog(); // calls constructor file to initialize Fido
		fido.setName("Fido");
		System.out.println(fido.getName()); // check that name set stuck
		fido.digHole();
		fido.setWeight(-1); // tests Fido for negative/zero weight
		
		int num = 9;
		fido.changeVar(num); // shows that everything is passed inside of Java
		System.out.println("randNum after method call: " + num);
		
		changeObjectName(fido);
		System.out.println("Dog's name after method call: " + fido.getName());
	}
	public static void changeObjectName(Dog fido) {
		fido.setName("Bobby");
	}
} // source: https://www.youtube.com/watch?v=vNHpsC5ng_E&list=PLF206E906175C7E07&index=1
