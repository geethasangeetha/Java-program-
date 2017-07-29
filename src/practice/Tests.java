package practice;
class ExceptionA extends Exception{}
class ExcpetionB extends ExceptionA{}
class Exc{
	void thrower() throws ExceptionA{
		throw new ExceptionA();
	}
}
public class Tests extends Exc{
	void thrower() throws ExceptionA{
		throw new ExceptionA();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
