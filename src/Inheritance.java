class cokgen{
	protected int yukseklik;
	protected int genislik;
	
	public void set_genyuk(int a ,int b) {
		yukseklik = a;
		genislik = b;
	}
}
	class dortgen extends cokgen{
		public int alan() {
			return yukseklik*genislik;
		}
	}
	class dikucgen extends cokgen{
		public int alan() {
			return yukseklik*genislik/2;
		}
	}


public class Inheritance {

	public static void main(String[] args) {

	dortgen d = new dortgen();
	d.set_genyuk(5, 10);
	System.out.println(d.alan());
		
	}
}
