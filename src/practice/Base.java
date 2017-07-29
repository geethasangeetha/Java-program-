package practice;

 class Base1 {
	public int value=0;
	public String st="szfvd";
	double d3 = 0xE;
	int amount = 9;
	Base1(){
		System.out.println("Base1");
		addValues();	
		}
	public void addValues(){
		value=+10;
	}
	public int getValues(){
		return value;
	}
}
public class Base extends Base1{
	Base(){
		//\u000dSystem.out.println("derived");
		addValues();
	}
	public void addValues(){
		value+=20;
	}public static final void main(String args[] ){
		Base1 b=new Base();
		System.out.println(b.getValues());
	}
}
