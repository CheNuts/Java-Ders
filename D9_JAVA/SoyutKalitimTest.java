
public class SoyutKalitimTest {

	public static void main(String[] args) {

		Animal[] hayvanDizi = new Animal[3];
		hayvanDizi[0] = new Dog("Fino");
		Cat c = new Cat();
		c.setName("Pamuk");
		hayvanDizi[1] = c;
		hayvanDizi[2] = new Wolf();
		for(int i = 0; i < hayvanDizi.length; i++) {
			if(hayvanDizi[i] instanceof Pet) {
				Pet p = (Pet) hayvanDizi[i];
				System.out.print(p.getName() + ": ");
			}
			hayvanDizi[i].makeNoise();
		}
		
		System.out.println("-----------------------");
		
		Rectangle r1 = new Rectangle(5, 3);
		System.out.println(r1);

		System.out.println("-----------------------");
		
		Kutu k1 = new Kutu(6);
		Kutu k2 = new Kutu(4, 6, 9);
		Kutu k3 = new Kutu(3, 5, 7);
		System.out.println("k1 vs k2: " + k1.compareTo(k2));
		System.out.println("k1 vs k3: " + k1.compareTo(k3));
		System.out.println("k3 vs k2: " + k3.compareTo(k2));
		
	}

}
