package practice;
interface ITest{
	public void setUp();
}
public class Interfaces {
	private String s;
	void set(){
		final String b="World";
		ITest test=new ITest(){
			public void setUp(){
				s="Hello";
				
			}
		};
		test.setUp();	System.out.println(s+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaces t= new Interfaces();
		t.set();
	}

}
