
class dikd�rtgen{
    public int  a1;
    public int  b1;
    
      int hesapla() {
    	  return a1*b1;
      }
      
      dikd�rtgen(){
    	  a1=10;
    	  b1=20;
      }
      
      dikd�rtgen(int a, int b){
    	  a1=a;
    	  b1=b;
      }
      
}


public class dikdConstructerOverloadConstructer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dikd�rtgen faydalan = new dikd�rtgen();
		System.out.println(faydalan.hesapla());
		
		dikd�rtgen faydalan2 = new dikd�rtgen(3,4);
		System.out.println(faydalan2.hesapla());

	}

}
