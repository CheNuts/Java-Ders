
public class Test {
	
	public static void swap(int x, int y) 	{
		System.out.println("x = " + x + " y = " + y);
		int t;
		t = x;
		x = y;
		y = t;
		System.out.println("x = " + x + " y = " + y);
	} // swap

	public static void main(String[] args) {
		
		int a = 7;
		int b = 99;

		System.out.println("a = " + a + " b = " + b);
		swap(a, b);
		System.out.println("a = " + a + " b = " + b);

	}

}
