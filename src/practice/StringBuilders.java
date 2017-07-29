package practice;

public class StringBuilders {
	public static void trims(){
		String x = new String("Hello World");
		String y = "Hello World";
		System.out.println(x == y); // false
		String z = " Hello World".trim();
		System.out.println(x.equals(z)); // true
	}
public static void main(String[] args) {
	StringBuilder sb1=new StringBuilder("EEE");
	sb1.append("Final year");
	sb1.insert(3," IV");
	System.out.println(sb1);
	sb1.delete(1, 4);
	sb1.deleteCharAt(6);
	System.out.println(sb1);
	trims();
}}
