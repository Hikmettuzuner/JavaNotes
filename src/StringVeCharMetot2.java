import java.util.Scanner;

public class StringVeCharMetot2 {
	
	public static int degerhesapla(String cümle, char harf) {
		int uzunluk,sayac;
		uzunluk = cümle.length();
		sayac = 0;
		for(int i=0;i<uzunluk;i++) {
			if(cümle.charAt(i)==harf)
				sayac++;
		}
				return sayac;
		
	}

	public static void main(String[] args) {
		// Bir Cümle Ýçerisinde ki Harf Sayýsýný Hesaplama
		Scanner scan = new Scanner(System.in);
		String cümle;
		char harf;
		
		System.out.println("Lütfen bir Cümle giriniz..");
		cümle = scan.nextLine();
		
		System.out.println("Lütfen aramak istediðiniz Harf...");
		harf = scan.next().charAt(0);
		
		System.out.println(degerhesapla(cümle,harf));
	}
}
