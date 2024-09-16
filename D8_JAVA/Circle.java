
public class Circle extends Shape {
	
	public static final float PI = 3.14F;
	public int yaricap;
	
	public Circle(int yaricap) {
		name = "Daire";
		this.yaricap = yaricap;
	}
	
	@Override
	public int area() {
		return (int)(PI * yaricap * yaricap);
	}
	
	@Override
	public String toString() {
		String tanim = "İsim: " + name + " - Yarıçap: " + yaricap +
				" - Alan: " + area();
		return tanim;
	}

}
