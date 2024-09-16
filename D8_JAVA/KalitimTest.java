
public class KalitimTest {

	public static void main(String[] args) {
		
		Shape s1 = new Shape();
		System.out.println("Shape İsim: " + s1.name);
		System.out.println("Shape Alan: " + s1.area());
		
		Rectangle r1 = new Rectangle(3, 5);
		System.out.println("Rectangle İsim: " + r1.name);
		System.out.println("Rectangle Alan: " + r1.area());
		
		System.out.println(r1);
		
		System.out.println("---------------------------------------");
		
		Animal[] hayvanDizisi = new Animal[3];
		hayvanDizisi[0] = new Dog();
		hayvanDizisi[1] = new Cat();
		hayvanDizisi[2] = new Bird();
		
		for(int i = 0; i < hayvanDizisi.length; i++) {
			hayvanDizisi[i].makeNoise();
			if(hayvanDizisi[i] instanceof Dog) {
				Dog d = (Dog) hayvanDizisi[i];
				d.bark();
			}
		}
		

		System.out.println("---------------------------------------");
		Shape[] sekilDizisi = new Shape[6];
		for(int i = 0; i < sekilDizisi.length; i++) {
			if(i % 2 == 0) {
				sekilDizisi[i] = new Rectangle(i+7, i+3);
			}
			else {
				sekilDizisi[i] = new Circle(2*i);
			}
		}
		
		for(int i = 0; i < sekilDizisi.length; i++) {
			System.out.println(sekilDizisi[i]);
			if(sekilDizisi[i] instanceof Rectangle) {
				Rectangle r = (Rectangle) sekilDizisi[i];
				r.ekranaCiz();
			}
		}
		
	}
	
}
