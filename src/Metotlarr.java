import java.util.Scanner;

public class Metotlarr {

	public static int islem(int a,int b) {
		if(a>=b)
			return a-b;
		else
			return b-a;
	}
	
	public static void main(String[] args) {
		// Kullanýcýdan Deðer Alýp Büyüðü Küçükten Çýkaran Metod
		Scanner scan = new Scanner(System.in);
		int a,b;
		System.out.println("Lütfen bir sayý giriniz.");
		a=scan.nextInt();
		System.out.println("Lütfen ikinci bir sayý giriniz.");
		b=scan.nextInt();
		
		System.out.println(islem(a,b));
		
	}

}
