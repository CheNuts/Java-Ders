
public class D3_Kutu {
	
	private static float varsayilan = 1;
	private float genislik;
	private float yukseklik;
	private float derinlik;
	
	public D3_Kutu(float genislik, float yukseklik, float derinlik) {
		this.genislik = genislik;
		this.yukseklik = yukseklik;
		this.derinlik = derinlik;
	}
	
	public float hacimHesapla() {
		return this.genislik * this.yukseklik * this.derinlik;
	}
	
	public float getGenislik() {
		return this.genislik;
	}
	
	public float getYukseklik() {
		return this.yukseklik;
	}
	
	public float getDerinlik() {
		return this.derinlik;
	}
	
	public void setGenislik(float genislik) {
		if(genislik > 0) {
			this.genislik = genislik;
		}
		else {
			this.genislik = varsayilan;
		}
	}
	
	public void setYukseklik(float yukseklik) {
		if(yukseklik > 0) {
			this.yukseklik = yukseklik;
		}
		else {
			this.yukseklik = varsayilan;
		}
	}
	
	public void setDerinlik(float derinlik) {
		if(derinlik > 0) {
			this.derinlik = derinlik;
		}
		else {
			this.derinlik = varsayilan;
		}
	}

}
