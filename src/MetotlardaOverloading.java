
public class MetotlardaOverloading {
	
	public static void topla(int a, int b) 
	{
		System.out.println(a+b);
	}
	public static void topla(int a, int b, int c) 
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MetotlardaOverloading sýnýflaraeris = new MetotlardaOverloading();
		int a,b,c;
		sýnýflaraeris.topla(2, 3);
		

	}

}
	