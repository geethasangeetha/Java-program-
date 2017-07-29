package practice;

public class Boolean1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*boolean keepGoing = true;
		 int result = 15, i = 10;
		do {
		 --i;
		 if(i==8) keepGoing = false;
		 result -= 2;
		 } while(keepGoing);
		
		 System.out.println(result);*/
		int m = 9, n = 1, x = 0;
		 while(m > n) {
		 m--;
		 n += 2;
		 x += m + n;
		}
		 System.out.println(x);
		 int count = 0;
		 ROW_LOOP: for(int row = 1; row <=5; row++)
		  for(int col = 1; col <=2 ; col++) {
		  if(row * col % 2 == 0) continue ROW_LOOP;
		  count++;
	}
		 System.out.println(count);
}
}