import java.util.Scanner;

public class dizilerr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] degeral = new int[10];
		
		int i, enbüyük;
		
		for(i=0;i<10;i++)
		{
			System.out.println("lütfen bir deðer giriniz");
			degeral[i]=scan.nextInt();		
		}
		
		enbüyük=degeral[0];
		
		for(i=1;i<10;i++)
		{
			if(degeral[i]>enbüyük)
				enbüyük=degeral[i];
		}
		
		System.out.println("en  büyük deðeriniz..." + enbüyük );
		

	/*	int[] dizi = {2,3};
		System.out.println(dizi[1]);
		new int[] dizinew = new int[3];
	*/	
	}
}
