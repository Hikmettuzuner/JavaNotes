import java.util.Scanner;

public class switchcasee {

	public static void main(String[] args) {
		// switch case yap�s�n�n kullan�m�
		Scanner scan = new Scanner(System.in);
		int a , b;
		int sonuc , islem;
		
		System.out.println("l�tfen ilk say�y� giriniz");
		a=scan.nextInt();
		System.out.println("l�tfen ikinci say�y� giriniz");
		b=scan.nextInt();
		System.out.println("toplama i�in 1'e bas�n�z");
		System.out.println("��karma i�in 2'e bas�n�z");
		System.out.println("b�lme i�in 3'e bas�n�z");
		System.out.println("�arpma i�in 4'e bas�n�z");
		islem = scan.nextInt();
		switch(islem)
		{
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a/b);
			break;
			default:
				System.out.println("1 ile 4 aras� i�lem se�iniz");
				break;
				
		}

	}
}
