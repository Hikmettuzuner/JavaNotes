class deneme
{
	private String ad;
	private String soyad;
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	
}



public class Class_Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deneme kullan = new deneme();
		
		kullan.setAd("Hikmet");
		System.out.println(kullan.getAd());
		
		

	}

}
