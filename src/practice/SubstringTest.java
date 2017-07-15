package practice;

public class SubstringTest{    

public static void main(String args[]){      

String String = "string isa string"; 

String s = "blooper";    

StringBuilder sb = new StringBuilder(s);    

sb.append(s.substring(4)).delete(3, 5);    

System.out.println(sb);

System.out.println(String.substring(3, 6));    
System.out.println("    hello java guru   ".trim());
}

}