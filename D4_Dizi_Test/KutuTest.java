
public class KutuTest {

	public static void main(String[] args) {

		Kutu kutu1 = new Kutu(1, -1, 1);
		System.out.println("Genişlik: " + kutu1.getGenislik());
		System.out.println("Yükseklik: " + kutu1.getYukseklik());
		System.out.println("Derinlik: " + kutu1.getDerinlik());
		System.out.println("Hacim: " + kutu1.hacimHesapla());
		
		System.out.println("---------------------------------");
		
		kutu1.setDerinlik(219.7F);
		System.out.println("Genişlik: " + kutu1.getGenislik());
		System.out.println("Yükseklik: " + kutu1.getYukseklik());
		System.out.println("Derinlik: " + kutu1.getDerinlik());
		System.out.println("Hacim: " + kutu1.hacimHesapla());

		System.out.println("---------------------------------");
		
		Kutu kutu2 = new Kutu(5.7F, 6.9F, 3.1F);
		float hacim1 = kutu1.hacimHesapla();
		float hacim2 = kutu2.hacimHesapla();
		System.out.println("1. kutunun hacmi: " + hacim1);
		System.out.println("2. kutunun hacmi: " + hacim2);
		if(hacim1 == hacim2) {
			System.out.println("İki kutu eşit boyuttadır");
		}
		else if(hacim1 > hacim2) {
			System.out.println("1. kutu daha büyüktür");
		}
		else {
			System.out.println("2. kutu daha büyüktür");
		}
		
	}

}
