package practice;
interface Interface{
	int Say();
	void add(int a,int b); 
}
abstract class Abstract{
	abstract void method();
	void add(int a,int b){
		System.out.println(a*b);
	}
}
public class ClassAbstract {
	public int Say(){
		System.out.println("Abstract");
		return 1;
	}
	void method(){
		int x=0;
		System.out.println(x++);
	}
	public static void main(String[] args) {
		ClassAbstract ca=new ClassAbstract();
		ca.method();
		((Interface) ca).add(12,3);
	}
}
