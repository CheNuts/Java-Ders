import java.util.Scanner;

public class D3_Java_Denemeleri {

	public static void main(String[] args) {
		
		/* 
		 * [0-10) aralığında sayılar için;
		 * - kendisine kadar olan sayıların toplamını ekrana yazın
		 * - sayının tek mi çift mi olduğunu ekrana yazın
		 */
		/*
		int toplam = 0;
		
		for(int i = 0; i < 10; i++) {
			toplam += i;
			System.out.println(i + " sayısına kadar olan sayılar toplamı " +
								toplam);
			
			if(i % 2 == 1) {
				System.out.println(i + " tek bir sayıdır");
			}
			else {
				System.out.println(i + " çift bir sayıdır");
			}
		}
		*/
		
		/*
		 * Kullanıcıdan kenar uzunluğu alın
		 * - İçi dolu kare çizin
		 * - İçi boş kare çizin
		 * - Eşkenar dik üçgen çizin
		 */
		Scanner konsol = new Scanner(System.in);
		int kenar;
		System.out.println("Karenin kenar uzunluğunu giriniz:");
		kenar = konsol.nextInt();
		/*
		// İçi dolu kare
		for(int i = 0; i < kenar; i++) { // karenin yuksekligi
			for(int j = 0; j < kenar; j++) { // karenin genisligi
				System.out.print(" * ");
			}
			System.out.println();
		}
		*/
		/*
		// İçi boş kare
		for(int i = 0; i < kenar; i++) { // karenin yuksekligi
			for(int j = 0; j < kenar; j++) { // karenin genisligi
				if(i == 0 || i == kenar-1 || j == 0 || j == kenar-1)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		*/
		
		// Eşkenar dik üçgen çizin
		for(int i = 0; i < kenar; i++) { // üçgenin yuksekligi
			for(int j = 0; j <= i; j++) { // üçgenin genisligi
				System.out.print(" * ");
			}
			System.out.println();
		}
		

	}

}
