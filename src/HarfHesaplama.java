import java.util.Scanner;

public class HarfHesaplama {

	public static void main(String[] args) {
		// String i�erisinde bir kullan�c�dan al�nan c�mlede ka�tane a karakteri olu�unu bulma
		
		Scanner scan = new Scanner(System.in);
		String c�mle;
		System.out.println("L�tfen Bir C�mle Giriniz..");
		c�mle = scan.next();
		
		int i,sayac,uzunluk;
		sayac = 0;
		uzunluk=c�mle.length();
		for(i=0;i<uzunluk;i++)
		{
			if(c�mle.charAt(i)=='a')
				sayac++;
			
		}
		System.out.println("string ifadede "+sayac+"a harfi vard�r");
		
	}

}
