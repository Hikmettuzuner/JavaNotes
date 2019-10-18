class erisimm{
	public String Ad;
	protected String Soyad;
	private int yas;
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	
	
	
}

public class erisim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		erisimm ers = new erisimm();
		
		ers.Ad="Aylin";
		ers.Soyad="Saðlam";
		
		ers.setYas(24);
		
		System.out.println(ers.Ad);
		System.out.println(ers.getYas());
		
	}

}
