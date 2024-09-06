
public class Kutu {
	
	private float genislik;
	private float yukseklik;
	private float derinlik;
	
	public Kutu(float genislik, float yukseklik, float derinlik) {
		setGenislik(genislik);
		setYukseklik(yukseklik);
		setDerinlik(derinlik);
	}
	
	public float hacimHesapla() {
		float hacim = this.genislik * this.yukseklik * this.derinlik;
		return hacim;
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
	
	

}
