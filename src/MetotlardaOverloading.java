
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
		MetotlardaOverloading s�n�flaraeris = new MetotlardaOverloading();
		int a,b,c;
		s�n�flaraeris.topla(2, 3);
		

	}

}
	