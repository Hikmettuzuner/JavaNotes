import java.util.Scanner;

public class diskriminantcözümü {

	public static void main(String[] args) {
		// Diskriminant Çözümü
			int a,b,c;
			float x1 , x2;
			float delta;
			
			Scanner scann = new Scanner(System.in);
			System.out.println("Lütfen a deðerini giriniz...");
			a = scann.nextInt();
			System.out.println("Lütfen b deðerini giriniz...");
			b=scann.nextInt();
			System.out.println("Lütfen b deðerini giriniz...");
			c=scann.nextInt();
			
			delta = b*b-(4*a*c);
			System.out.println(delta);

			if(delta>0) 
			{
				x1 = (float) ((-b+Math.sqrt(delta))/(2*a));
				x2 = (float) ((-b-Math.sqrt(delta))/(2*a));
				System.out.println("x1 deðeri " + x1 + "  " + " x2 deðeri " + x2);

			}
			
			
			
	}

}
