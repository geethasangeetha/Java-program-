package practice;

public class Bool {
	public static boolean a;
	int i=0XCAFE;
	byte b1=127;
	public static boolean b;
	public static boolean c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean e1=(a=true)||((b=true)&&(c=false));

		System.out.println(a);
		System.out.println(b);
		System.out.println(c); 
		//System.out.println(e);
		System.out.println(e1);
	}

}
