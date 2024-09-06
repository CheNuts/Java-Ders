import java.util.Scanner;

public class DiziTest {

	public static void main(String[] args) {

		int[] dizi1 = new int[10];
		// Dizi indekslerine değer ata
		for(int i = 0; i < dizi1.length; i++) {
			dizi1[i] = 2 * i;
		}
		// Dizi indekslerindeki değerleri kullan
		for(int i = 0; i < dizi1.length; i++) {
			System.out.println(i + ". indekste bulunan sayı: " + dizi1[i]);
		}

		/*
		 * Kullanıcıdan 3 sayı alıp dizi içerisine yerleştirin
		 * En büyük sayının hangi sayı ve kaçıncı sayı olduğunu yazın
		 */
		Scanner oku = new Scanner(System.in);
		int[] sayilar = new int[5];
		System.out.println("Beş adet sayı giriniz:");
		for(int i = 0; i < sayilar.length; i++) {
			sayilar[i] = oku.nextInt();
		}
		int max = sayilar[0];
		int maxIndex = 0;
		for(int i = 1; i < sayilar.length; i++) {
			if(sayilar[i] > max) {
				max = sayilar[i];
				maxIndex = i;
			}
		}
		
		System.out.println("Girdiğiniz sayılardan en büyük olanı " +
					(maxIndex+1) + ". sayı olan " + max + " sayısıdır.");
		
		/*
		 * Kullanıcıdan 5 tam sayı alın ve 
		 * bu sayıların ortalamasını float değer olarak gösterin
		 */
		float toplam = 0;
		for(int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
		}
		float ort = toplam / sayilar.length;
		System.out.println("Girdiğiniz sayıların ortalaması: " + ort);
	}

}
