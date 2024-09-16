
public class Kutu implements Comparable<Kutu> {

	private float genislik;
	private float yukseklik;
	private float derinlik;
	
	public Kutu(Kutu ornekKutu) {
		setGenislik(ornekKutu.getGenislik());
		setYukseklik(ornekKutu.getYukseklik());
		setDerinlik(ornekKutu.getDerinlik());
	}
	
	public Kutu(float boyut) {
		this(boyut, boyut, boyut);
		/*
		setGenislik(boyut);
		setYukseklik(boyut);
		setDerinlik(boyut);
		*/
	}
	
	public Kutu(float genislik, float yukseklik, float derinlik) {
		setGenislik(genislik);
		setYukseklik(yukseklik);
		setDerinlik(derinlik);
	}
	
	public float getGenislik() {
		return genislik;
	}
	
	public void setGenislik(float genislik) {
		if(genislik > 0)
			this.genislik = genislik;
		else
			this.genislik = 1;
	}
	
	public float getYukseklik() {
		return yukseklik;
	}
	
	public void setYukseklik(float yukseklik) {
		if(yukseklik > 0)
			this.yukseklik = yukseklik;
		else
			this.yukseklik = 1;
	}
	
	public float getDerinlik() {
		return derinlik;
	}
	
	public void setDerinlik(float derinlik) {
		if(derinlik > 0)
			this.derinlik = derinlik;
		else
			this.derinlik = 1;
	}
	
	public void bilgiyiGoster() {
		System.out.println("Genişlik: " + this.genislik);
		System.out.println("Yükseklik: " + this.yukseklik);
		System.out.println("Derinlik: " + this.derinlik);
		System.out.println("----------------------------");
	}
	
	public float hacimHesapla() {
		float hacim = this.genislik * this.yukseklik * this.derinlik;
		return hacim;
	}
	
	@Override
	public int compareTo(Kutu o) {
		float hacimFarki = this.hacimHesapla() - o.hacimHesapla();
		if(hacimFarki > 0) return 1;
		else if(hacimFarki < 0) return -1;
		else return 0;
	}

}
