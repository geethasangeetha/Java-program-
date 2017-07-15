package java8;

import static java8.StudPredicate.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class TestStud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud s=new Stud(12,"viki");
		Stud s1=new Stud(13,"juli");
		Stud s2=new Stud(1,"hari");
				
		List<Stud> stud=new ArrayList<Stud>();
		stud.addAll(Arrays.asList(new Stud[] {s,s1,s2}));
		System.out.println(stud);
		System.out.println(checkList(stud,isEligibleToStud()));
		
	}

}
