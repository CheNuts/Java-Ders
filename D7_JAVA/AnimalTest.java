
public class AnimalTest {

	public static void main(String[] args) {

		System.out.println("----- Animal nesnesi -----");
		Animal a = new Animal();
		a.name = "Sürüngen";
		a.doYourThing();

		System.out.println("----- Dog nesnesi -----");
		Dog d = new Dog();
		d.name = "Boncuk";
		d.doYourThing();

	}

}
