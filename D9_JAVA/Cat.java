
public class Cat extends Animal implements Pet {

	private String name;
	
	@Override
	public void makeNoise() {
		System.out.println("Miyav miyav");
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
