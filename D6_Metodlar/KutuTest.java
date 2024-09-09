
public class KutuTest {

	public static void main(String[] args) {

		Kutu kutu1 = new Kutu(3, 5, 7);
		System.out.println("kutu1:");
		kutu1.bilgiyiGoster();

		Kutu kutu2 = new Kutu(2);
		System.out.println("kutu2:");
		kutu2.bilgiyiGoster();

		Kutu kutu3 = new Kutu(kutu1);
		System.out.println("kutu3:");
		kutu3.bilgiyiGoster();

		Kutu kutu4 = kutu1;
		System.out.println("kutu4:");
		kutu4.bilgiyiGoster();
		
		kutu1.setDerinlik(6);
		System.out.println("kutu1 derinlik: " + kutu1.getDerinlik());
		System.out.println("kutu3 derinlik: " + kutu3.getDerinlik());
		System.out.println("kutu4 derinlik: " + kutu4.getDerinlik());

	}

}
