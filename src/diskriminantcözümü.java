import java.util.Scanner;

public class diskriminantc�z�m� {

	public static void main(String[] args) {
		// Diskriminant ��z�m�
			int a,b,c;
			float x1 , x2;
			float delta;
			
			Scanner scann = new Scanner(System.in);
			System.out.println("L�tfen a de�erini giriniz...");
			a = scann.nextInt();
			System.out.println("L�tfen b de�erini giriniz...");
			b=scann.nextInt();
			System.out.println("L�tfen b de�erini giriniz...");
			c=scann.nextInt();
			
			delta = b*b-(4*a*c);
			System.out.println(delta);

			if(delta>0) 
			{
				x1 = (float) ((-b+Math.sqrt(delta))/(2*a));
				x2 = (float) ((-b-Math.sqrt(delta))/(2*a));
				System.out.println("x1 de�eri " + x1 + "  " + " x2 de�eri " + x2);

			}
			
			
			
	}

}
