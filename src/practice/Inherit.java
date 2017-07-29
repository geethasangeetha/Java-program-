package practice;

 class Test1{
	Test1(){
		System.out.println("Parent");
	}
	Test1(int a,int b){
		this();
		System.out.println(a+b);
	}
	static void show(){
		System.out.println("welcome1" );
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
		Test1.show();
		new Test1(13,3);
		
	
	}
}
