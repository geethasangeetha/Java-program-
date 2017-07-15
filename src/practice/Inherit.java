package practice;

 class Test{
	Test(){
		System.out.println("Parent");
	}
	Test(int a,int b){
		this();
		System.out.println(a+b);
	}
	static void show(){
		System.out.println("welcome" );
	}
	static void show(int a){
		System.out.println(a);
	}

}
public class Inherit extends Test{
	Inherit(){
	super();
	}
	static void show(){
		System.out.println("welcome" );
	}
	
	public static void main(String []args){
		show();
		new Test(13,3);
		show(100);
	
	}
}
