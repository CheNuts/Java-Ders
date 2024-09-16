
public class Rectangle extends Shape {
	
	public int genislik;
	public int yukseklik;
	
	public Rectangle(int genislik, int yukseklik) {
		name = "Dikdörtgen";
		this.genislik = genislik;
		this.yukseklik = yukseklik;
	}

	@Override
	public String toString() {
		String tanim = "İsim: " + name + " - Genişlik: " + genislik +
						" - Yükseklik: " + yukseklik + " - Alan: " +
						area();
		return tanim;
	}

	@Override
	public int area() {
		return genislik * yukseklik;
	}

}
