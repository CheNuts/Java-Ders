
public class BILOgrenci {
	
	private String isim;
	private int ogrNo;
	private BILOgrenci labArkadasi;
	
	public BILOgrenci(String isim, int ogrNo) {
		this.isim = isim;
		this.ogrNo = ogrNo;
	}

	public String getIsim() {
		return isim;
	}

	public int getOgrNo() {
		return ogrNo;
	}
	
	public void labArkadasiAta(BILOgrenci labArkadasi) {
		this.labArkadasi = labArkadasi;
	}
	
	public void bilgileriYazdir() {
		System.out.println("---------------------------");
		System.out.println("Öğrencinin");
		System.out.println("İsmi: " + this.isim);
		System.out.println("Numarası: " + this.ogrNo);
		if(this.labArkadasi != null) {
			System.out.println("Lab arkadaşı isim: " + this.labArkadasi.getIsim());
			System.out.println("Lab arkadaşı no: " + this.labArkadasi.getOgrNo());
		}
		else {
			System.out.println("Öğrencinin herhangi bir lab arkadaşı yoktur.");
		}
	}
	
}
