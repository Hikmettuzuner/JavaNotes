import java.util.Scanner;

public class StringVeCharMetot2 {
	
	public static int degerhesapla(String c�mle, char harf) {
		int uzunluk,sayac;
		uzunluk = c�mle.length();
		sayac = 0;
		for(int i=0;i<uzunluk;i++) {
			if(c�mle.charAt(i)==harf)
				sayac++;
		}
				return sayac;
		
	}

	public static void main(String[] args) {
		// Bir C�mle ��erisinde ki Harf Say�s�n� Hesaplama
		Scanner scan = new Scanner(System.in);
		String c�mle;
		char harf;
		
		System.out.println("L�tfen bir C�mle giriniz..");
		c�mle = scan.nextLine();
		
		System.out.println("L�tfen aramak istedi�iniz Harf...");
		harf = scan.next().charAt(0);
		
		System.out.println(degerhesapla(c�mle,harf));
	}
}
