
public class Animal {
	
	public String name = "";
	public String noise = "";
	public int numTimesPerformed = 0;
	
	public void identifySelf() {
		System.out.println("Benim adım " + name);
	}
	
	public void perform() {
		doYourThing();
		numTimesPerformed++;
	}
	
	public void doYourThing() {
		
	}
	
}
