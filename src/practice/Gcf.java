package practice;

import java.util.Scanner;

public class Gcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub n1,n2,n3
		int result=0;
		int n1;
		int n2;
		int n3;
		System.out.println("enter any three values");
		Scanner s= new Scanner(System.in);
		n1=s.nextInt();
		n2=s.nextInt();
		n3=s.nextInt();
		for (int i=1;i<n3;i++){
			if((n1%i==0)&&(n2%i==0)&&(n3%i==0)){
				result =i;
			}
		}
		System.out.println("Gcf"+result);
	}
	static void methodLcm(){
		
	}

}
