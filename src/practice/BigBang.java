package practice;

abstract class Bang{
	 //abstract void f();  //(0)
	   final    void g(){
		   System.out.println("Final");
	   }
	 //final    void h(){} //(1)
	   protected static int i;
	   static {
		   System.out.println(i);
	   }
	   
	   
	}

	public  class BigBang extends Bang{
		 static public void k(){
			 i++; 
		 System.out.println(i);}
	 BigBang(int n) { 
		 
		 m = n;
		 System.out.println(m);
	 } //(2)
	   public static void main(String args[]){
	      Bang mc = new BigBang(12);
	      mc.g();
	      
	   }
	   void h(){}
	    //(3)
	
	   int m;
	}