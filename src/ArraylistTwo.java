import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///Kulln�c�dan bir say� al ve tek say�lar� ba�a yaz
		String sayi;
		int bs, i , swap;
		char c;
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir say� giirinz");
		sayi = scan.nextLine();
		
		ArrayList<Integer> liste= new ArrayList<>();
		
		
		bs = sayi.length();
		
		for(i=0;i<bs;i++) {
			c=sayi.charAt(i);
			liste.add(Integer.parseInt(Character.toString(c)));
			
		}
		System.out.println(liste);
		
		for(i=0;i<bs;i++) {
			if(liste.get(i)%2==1) {
				swap = liste.get(i);
				liste.remove(i);
				liste.add(0, swap);
			}
		}
		System.out.println(liste);
	}

}
