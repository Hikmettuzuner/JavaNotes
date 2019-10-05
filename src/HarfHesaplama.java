import java.util.Scanner;

public class HarfHesaplama {

	public static void main(String[] args) {
		// String içerisinde bir kullanýcýdan alýnan cümlede kaçtane a karakteri oluðunu bulma
		
		Scanner scan = new Scanner(System.in);
		String cümle;
		System.out.println("Lütfen Bir Cümle Giriniz..");
		cümle = scan.next();
		
		int i,sayac,uzunluk;
		sayac = 0;
		uzunluk=cümle.length();
		for(i=0;i<uzunluk;i++)
		{
			if(cümle.charAt(i)=='a')
				sayac++;
			
		}
		System.out.println("string ifadede "+sayac+"a harfi vardýr");
		
	}

}
