package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array={"haw","daw"};
		List <String> list=Arrays.asList(array);
		System.out.println(list);
		//sorting of array
		List<Integer> list1=new ArrayList();
		list1.add(23);
		list1.add(46);
		list1.add(11);
		Collections.sort(list1);
		System.out.println(list1);
	}

}
