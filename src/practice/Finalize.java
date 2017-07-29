package practice;



public class Finalize {
	//private static List objects = new ArrayList();
	protected void finalize() {
	/*objects.add(this); // Don't do this
	System.out.println(objects);*/
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalize finalize= new Finalize();
		finalize.finalize();
	}

}
