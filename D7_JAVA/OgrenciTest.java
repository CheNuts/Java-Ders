
public class OgrenciTest {

	public static void main(String[] args) {
		BILOgrenci ogr1, ogr2, ogr3;
		
		ogr1 = new BILOgrenci("Ahmet", 123);
		ogr2 = new BILOgrenci("Ali", 124);
		ogr3 = new BILOgrenci("Ayşe", 125);
		
		ogr1.labArkadasiAta(ogr2);
		ogr2.labArkadasiAta(ogr1);
		
		ogr1.bilgileriYazdir();
		ogr2.bilgileriYazdir();
		ogr3.bilgileriYazdir();
		
	}
	
}
