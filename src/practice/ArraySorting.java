package practice;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = { "10","8","AA","aa", "0","KK", "1","cV","Ac","12","100","sdr" };
		Arrays.sort(strings);
		for (String string : strings)
		System.out.println(string + " ");
		//binary search
		int[] num={2,3,4,5};
		System.out.println(Arrays.binarySearch(num,4));
	}

}
