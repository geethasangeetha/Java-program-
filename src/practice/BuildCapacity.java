package practice;

public class BuildCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder strb=new StringBuilder("Hello");
		System.out.println(strb.length());
		
		System.out.println(strb.capacity());
		strb.ensureCapacity(50);
		System.out.println(strb);
	}

}
