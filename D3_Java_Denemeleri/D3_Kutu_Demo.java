
public class D3_Kutu_Demo {

	public static void main(String[] args) {

		D3_Kutu ilkKutum = new D3_Kutu(1, 1, 1);
		System.out.println("Hacim: " + ilkKutum.hacimHesapla());
		
		ilkKutum.setGenislik(5.9F);
		System.out.println("Hacim: " + ilkKutum.hacimHesapla());
		
		ilkKutum.setYukseklik(-9.8F);
		System.out.println("Hacim: " + ilkKutum.hacimHesapla());

	}

}
