package practice;

public class ByteDemo {

	   public static void main(String[] args) {

	      // create 2 byte primitives bt1, bt2
	      byte bt1, bt2;

	      // create and assign values to String's s1, s2
	      String s1 = "54";
	      String s2 = "-21";

	      // create and assign values to int r1, r2
	      int r1 = 8;  // represents octal
	      int r2 = 16; // represents hexadecimal
	       /**
	       *  static method is called using class name. Assign parseByte
	       *  result on s1, s2 to bt1, bt2 using radix r1, r2
	       */
	      bt1 = Byte.parseByte(s1, r1);
	      bt2 = Byte.parseByte(s2, r2);
	      System.out.println();
	      String str1 = "Parse byte value of " + s1 + " is " + bt1;
	      String str2 = "Parse byte value of " + s2 + " is " + bt2;

	      // print bt1, bt2 values
	      System.out.println( str1 );
	      System.out.println( str2 );
	   }
	}