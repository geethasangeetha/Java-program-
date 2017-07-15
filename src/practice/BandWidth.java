package practice;

public class BandWidth {
	
	    public int available ;
	    public int getAvailable(){
	    	System.out.println(available);
	        return available;
	    }
	    public BandWidth(int quota){
	        this.available = quota;
	        System.out.println(quota);
	    }
	    public void addMore(int more){
	        available += more;
	    }
	    
	    
	    public static  void main(String[] args) {
		// TODO Auto-generated method stub
		BandWidth bw=new BandWidth(100);
		bw.available=123;
		
		
		System.out.println(bw.getAvailable());
	
	}
	

}
