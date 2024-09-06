
public class DiziTest {

	public static void main(String[] args) {
		
		/*
		 * Verilen dizinin elemanlarının sırasını ters çeviren
		 * programı yazın
		 */
		int[] x = {1, 5, 2, 6, 3, 4};
		
		System.out.print("Dizinin başlangıç sırası: [ ");
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println("]");
		
		int temp;
		for(int i = 0; i < x.length/2; i++) {
			int sagIndex = x.length-1-i;
			// x[i] ile x[sagIndex] değerlerini yer değiştir
			temp = x[i];
			x[i] = x[sagIndex];
			x[sagIndex] = temp;
		}

		System.out.print("Dizinin sırasının ters döndürülmüş hali: [ ");
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println("]");

	}

}
