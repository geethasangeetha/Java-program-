package practice;

public class Sign {
	public void mul(int a,int b){
		
	}
	protected Sign(){//all access modifer allow the constructor
		
	}
	public int mul1(int a,int b){
		return a*b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double b=10.5/-0.90;
		float f=\u0038;
		long l=789;
		char c='\u004C';
		System.out.println(c);
		System.out.println(f+l );
		if(b==Double.POSITIVE_INFINITY)
			System.out.println("Positive infinity");
		else
			System.out.println("Negative");
		Sign s=new Sign();
		s.mul(1, 2);
	}

}
