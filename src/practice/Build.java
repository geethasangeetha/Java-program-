package practice;

public class Build {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("Java"); 
		sb.insert(4, "Codes");
		System.out.println(sb);
		sb.replace(0, 4, "logical");
		System.out.println(sb);
		sb.delete(2, 3);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
