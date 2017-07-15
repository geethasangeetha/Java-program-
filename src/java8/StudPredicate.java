package java8;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudPredicate {
public  static Predicate<Stud> isEligibleToStud(){
	return s->s.getId()>=10;
	
}
public static List<Stud>checkList(List<Stud> stud,Predicate<Stud>predicate){
	return stud.stream().filter(predicate).collect(Collectors.<Stud>toList());
}
}
