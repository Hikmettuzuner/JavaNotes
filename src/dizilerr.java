import java.util.Scanner;

public class dizilerr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] degeral = new int[10];
		
		int i, enb�y�k;
		
		for(i=0;i<10;i++)
		{
			System.out.println("l�tfen bir de�er giriniz");
			degeral[i]=scan.nextInt();		
		}
		
		enb�y�k=degeral[0];
		
		for(i=1;i<10;i++)
		{
			if(degeral[i]>enb�y�k)
				enb�y�k=degeral[i];
		}
		
		System.out.println("en  b�y�k de�eriniz..." + enb�y�k );
		

	/*	int[] dizi = {2,3};
		System.out.println(dizi[1]);
		new int[] dizinew = new int[3];
	*/	
	}
}
