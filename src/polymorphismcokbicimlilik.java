class hayvan{
	public void ses() {
		System.out.println("Hayvan�n Ses ��karmas�");
	}
}

class kedi extends hayvan{
	public void ses() {
		System.out.println("miyav");
	}
}

class k�pek extends kedi{
	public void ses() {
		System.out.println("hav hav");
	}
}
////////////////////METOTLAR ��ERS�NDE SINIF �A�IRMI� OLDUK
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
