package practice;

public class Rabbit {
	public void add(){
		System.out.println("fd");
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rabbit one=new Rabbit();
		Rabbit two= new Rabbit();
		Rabbit three =one;
		System.out.println("fdgg");
		one=null;
		Rabbit four=one;
		three=null;
		two=null;
		//two.add();
		System.out.println("fdg");
		two=new Rabbit();
		two.add();
		System.gc();
	}

}
