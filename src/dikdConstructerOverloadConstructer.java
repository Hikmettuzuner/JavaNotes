
class dikdörtgen{
    public int  a1;
    public int  b1;
    
      int hesapla() {
    	  return a1*b1;
      }
      
      dikdörtgen(){
    	  a1=10;
    	  b1=20;
      }
      
      dikdörtgen(int a, int b){
    	  a1=a;
    	  b1=b;
      }
      
}


public class dikdConstructerOverloadConstructer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dikdörtgen faydalan = new dikdörtgen();
		System.out.println(faydalan.hesapla());
		
		dikdörtgen faydalan2 = new dikdörtgen(3,4);
		System.out.println(faydalan2.hesapla());

	}

}
