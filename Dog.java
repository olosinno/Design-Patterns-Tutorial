package superclass_inheritance_test;

public class Dog extends Animal {
	public void digHole() {System.out.println("Dug a hole...");}

	public Dog() {
		super();
		setSound("Bark!");
	}
	
	public void changeVar(int num) {
		num = 12;
		System.out.println("randNum in method: " + num);
		}
}
