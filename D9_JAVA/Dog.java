
public class Dog extends Animal implements Pet {

	private String name;
	
	public Dog(String name) {
		setName(name);
	}
	
	@Override
	public void makeNoise() {
		System.out.println("Hav hav");
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

}
