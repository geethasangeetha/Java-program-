package practice;

import java.util.function.Predicate;

public class Lamda{
     public static void main(String[] args) { 
       // INSERT CODE HERE 
    	 System.out.println(test(i->i==2));
    	 System.out.println(test((i)->i==2));
    	 System.out.println(test((i)->{return i==2;}));
     } 
     private static boolean test(Predicate<Integer> p) { 
       return p.test(2); 
     } 
}