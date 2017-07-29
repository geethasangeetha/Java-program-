package practice;
 class Mammal{
	 public void eat(Mammal m) {
		System.out.println("First");
	}
}
 class Hourse extends Mammal{
	 public void eat(Hourse h){
		 System.out.println("second");
	 }
 }
 class Cattle extends Hourse{
	 public void eat(Cattle c){
		 System.out.println("Thrid");
	 }
	  }
public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal h=new Hourse();
		
		Hourse e=new Cattle();
		
		e.eat(h);
		
	}

}
