
public class Dog extends Animal {
	
	public Dog() {
		noise = "Hav hav";
	}
	
	public void doYourThing() {
		identifySelf();
		System.out.println(noise);
	}
	
	public void identifySelf() {
		super.identifySelf();
		System.out.println("Ben bir köpeğim.");
	}
	
}
