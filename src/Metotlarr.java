import java.util.Scanner;

public class Metotlarr {

	public static int islem(int a,int b) {
		if(a>=b)
			return a-b;
		else
			return b-a;
	}
	
	public static void main(String[] args) {
		// Kullan�c�dan De�er Al�p B�y��� K���kten ��karan Metod
		Scanner scan = new Scanner(System.in);
		int a,b;
		System.out.println("L�tfen bir say� giriniz.");
		a=scan.nextInt();
		System.out.println("L�tfen ikinci bir say� giriniz.");
		b=scan.nextInt();
		
		System.out.println(islem(a,b));
		
	}

}
