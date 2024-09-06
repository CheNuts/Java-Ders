
public class RecursionTest {

	public static void main(String[] args) {
		
		System.out.println("For döngüsü 2^7 sonuç: " + powFor(2, 7));
		System.out.println("Yinelemeli 1. metot 2^7 sonuç: " + powRec(2, 7));
		System.out.println("Yinelemeli 2. metot 2^7 sonuç: " + powRec2(2, 7));

		System.out.println("For döngüsü 2^-7 sonuç: " + powFor(2, -7));
		System.out.println("Yinelemeli 1. metot 2^-7 sonuç: " + powRec(2, -7));
		System.out.println("Yinelemeli 2. metot 2^-7 sonuç: " + powRec2(2, -7));
		
		System.out.println("---------------------------");
		
		for(int i = -3; i < 10; i++) {
			System.out.println("fib(" + i + ") = " + fib(i));
		}
		
		System.out.println("---------------------------");
		
		/*
		 * fac(n) = n! sonucunu döndüren recursive metodu yazın
		 * n < 0  --> fac(n) = -1
		 * n == 0 --> fac(0) = 1
		 * n > 0  --> fac(n) = n * fac(n-1)
		 */
		for(int i = -3; i < 10; i++) {
			System.out.println("fac(" + i + ") = " + fac(i));
		}
		
	}
	
	public static double powFor(double taban, double us) {
		boolean negatifMi = false;
		if(us < 0) {
			negatifMi = true;
			us *= -1;
		}
		double sonuc = 1;
		for(int i = 0; i < us; i++) {
			sonuc *= taban;
		}
		if(negatifMi) {
			sonuc = 1 / sonuc;
		}
		return sonuc;
	}
	
	public static double powRec(double taban, double us) {
		boolean negatifMi = false;
		if(us < 0) {
			negatifMi = true;
			us *= -1;
		}
		double sonuc;
		if(us == 0) {
			sonuc = 1;
		}
		else if(us == 1) {
			sonuc = taban;
		}
		else {
			us--;
			sonuc = taban * powRec(taban, us);
		}
		if(negatifMi) {
			sonuc = 1 / sonuc;
		}
		return sonuc;
	}
	
	public static double powRec2(double taban, double us) {
		boolean negatifMi = false;
		if(us < 0) {
			negatifMi = true;
			us *= -1;
		}
		double sonuc;
		if(us == 0) {
			sonuc = 1;
		}
		else if(us == 1) {
			sonuc = taban;
		}
		else if(us % 2 == 0) {
			us /= 2;
			double yarisi = powRec2(taban, us);
			sonuc = yarisi * yarisi;
		}
		else {
			us--;
			sonuc = taban * powRec2(taban, us);
		}

		if(negatifMi) {
			sonuc = 1 / sonuc;
		}
		return sonuc;
		
	}
	
	public static int fib(int num) {
		if(num < 0)
			return -1;
		else if(num == 0)
			return 0;
		else if(num == 1)
			return 1;
		else
			return fib(num-1) + fib(num-2);
	}
	
	public static int fac(int n) {
		if(n < 0)
			return -1;
		else if(n == 0)
			return 1;
		else
			return n * fac(n-1);
	}
	
}
