package siberakademi2;

import java.util.Scanner;

public class D2_Java_Giris {
	
	public static void main(String[] args) {
		
		Scanner konsoldanOku = new Scanner(System.in);
		
		/*int tamsayi;
		
		System.out.println("Bir tam sayı giriniz:");
		tamsayi = konsoldanOku.nextInt();
		
		System.out.println("Girdiğiniz tam sayı:"+ tamsayi);
		
		float ondaliksayi;
		System.out.println("Bi ondalıklı sayı yaz:");
		ondaliksayi = konsoldanOku.nextFloat();
		System.out.println("Girdiğiniz sayi :"+ ondaliksayi);
		
		System.out.println("\n...............................\n");
		
		
		
		String isim;
		System.out.println("Lütfen isminizi giriniz");
		isim = konsoldanOku.nextLine();
		System.out.println("Adınız:"+ isim);
		
		int sayi, karesi;
		do {
			System.out.println("Lütfen bir tam sayı giriniz: (durmak için - bir değer girin)");
			sayi = konsoldanOku.nextInt();
			karesi = sayi*sayi;
			System.out.println("Girilen sayi:"+sayi);
			System.out.println("Girilen sayinin karesi:"+karesi);
			
		
		}
		while (sayi != -1);
		System.out.println("Döngüden çıktı");
		
		*
		*Scanner scanner = new Scanner(System.in);


System.out.println("Lütfen 3 adet sayı girin:");
int sayi1 = scanner.nextInt();
int sayi2 = scanner.nextInt();
int sayi3 = scanner.nextInt();


if (sayi1 > sayi2 && sayi1 > sayi3) {
    System.out.println("Sayı 1 büyüktür.");
} else if (sayi2 > sayi1 && sayi2 > sayi3) {
    System.out.println("Sayı 2 büyüktür.");
} else if (sayi3 > sayi1 && sayi3 > sayi2) {
    System.out.println("Sayı 3 büyüktür.");
} else {
    System.out.println("Bazı sayılar eşit.");
}


scanner.close();
}
}
		


 int sayi1, sayi2, sayi3;
 System.out.println("3 tam sayı gir");
 sayi1 = konsoldanOku.nextInt();
 sayi2 = konsoldanOku.nextInt();
 sayi3 = konsoldanOku.nextInt();
 System.out.println("Girdiğiniz sayılar:"+ sayi1 +sayi2 + sayi3);
 
 if(sayi1>sayi2 && sayi1>sayi3) {
	 
	 System.out.println("Girdiğiniz en büyük sayı"+ sayi1);
 }
 else if(sayi2>sayi1 && sayi2>sayi3) {
	 System.out.println("Girdiğiniz en büyük sayı "+sayi2);
 }
 else {
	 System.out.println("Girilen en büyük sayı"+sayi3);
 }
 */
		int aylar;
		
		System.out.println("Seçmek istediğiniz ayın kaç gün olduğunu görmek için 1-12 arasında kaçıncı aya denk geldiğini belirtiniz");
		aylar = konsoldanOku.nextInt();
		while(aylar < 1 || aylar > 12) {
			System.out.println("Girdiğiniz değer 1 ile 12 aralığında olmalı");
			aylar = konsoldanOku.nextInt();
			break;
			
		}
		
		switch(aylar) {
		case 1:
			System.out.println(" 31 gün");
        break;
		case 2:
			System.out.println("28 gün");
        break;
		case 3:
			System.out.println("31 gün");
        break;
		case 4:
			System.out.println("30 gün");
        break;
		case 5:
			System.out.println("31 gün");
        break;
		case 6:
			System.out.println("30 gün");
        break;
		case 7:
			System.out.println("31 gün");
        break;
		case 8:
			System.out.println("31 gün");
        break;
		case 9:
			System.out.println("30 gün");
        break;
		case 11:
			System.out.println("31 gün");
        break;
		case 12:
			System.out.println("30 gün");
        break;
		}
 
	}
}
 

       

