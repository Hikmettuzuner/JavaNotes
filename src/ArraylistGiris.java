import java.util.ArrayList;

public class ArraylistGiris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] dizi= new int[10];
		
		ArrayList<Integer> sayilar = new ArrayList<>();
		
		sayilar.add(23);
		sayilar.add(32);
		sayilar.add(87);
		
		System.out.println(sayilar);
		
		System.out.println(sayilar.get(1));
		
		for(Integer x : sayilar) {
			System.out.println(x+" - ");
			
			
			
		}
		
	}

}
