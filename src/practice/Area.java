package practice;
class Rec{
	public int area(int a,int b){
		System.out.println("rec");
		return a*b;
	}
}
class Rectangle extends Rec{
	public long area(long a,long b){
		System.out.println("rectangle");
		return (int) Math.pow(a,b);
	}
}
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle a=new Rectangle();
		System.out.println( a.area(12,32));
		System.out.println(a.area(23L, 12L));
		
	}

}
