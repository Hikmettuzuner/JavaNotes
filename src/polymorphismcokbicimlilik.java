class hayvan{
	public void ses() {
		System.out.println("Hayvanýn Ses Çýkarmasý");
	}
}

class kedi extends hayvan{
	public void ses() {
		System.out.println("miyav");
	}
}

class köpek extends kedi{
	public void ses() {
		System.out.println("hav hav");
	}
}
////////////////////METOTLAR ÝÇERSÝNDE SINIF ÇAÐIRMIÞ OLDUK
class hses extends hayvan{
	public void hsesi(hayvan Hayvan) {
		Hayvan.ses();
	}
}
	
public class polymorphismcokbicimlilik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		hayvan h = new hayvan();	
		h.ses();
		
		kedi cat = new kedi();
		cat.ses();
		
		hses ks = new hses();
		ks.hsesi(h);
	
	}

}
