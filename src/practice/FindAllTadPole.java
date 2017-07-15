package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

interface CanSwim {}
 class Amphibian implements CanSwim {}
class Tadpole extends Amphibian {}
public class FindAllTadPole {
public static void main(String[] args) {
List<Tadpole> tadpoles = new ArrayList<Tadpole>();
for(Amphibian amphibian : tadpoles) {
	CanSwim  tadpole = amphibian;
	
}

System.out.println(LocalDate.of(2015, 3, 1));
 System.out.println(LocalDate.of(2015, 4, 1));
} }
