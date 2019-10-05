import java.util.Scanner;

public class switchcasee {

	public static void main(String[] args) {
		// switch case yapýsýnýn kullanýmý
		Scanner scan = new Scanner(System.in);
		int a , b;
		int sonuc , islem;
		
		System.out.println("lütfen ilk sayýyý giriniz");
		a=scan.nextInt();
		System.out.println("lütfen ikinci sayýyý giriniz");
		b=scan.nextInt();
		System.out.println("toplama için 1'e basýnýz");
		System.out.println("çýkarma için 2'e basýnýz");
		System.out.println("bölme için 3'e basýnýz");
		System.out.println("çarpma için 4'e basýnýz");
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
				System.out.println("1 ile 4 arasý iþlem seçiniz");
				break;
				
		}

	}
}
