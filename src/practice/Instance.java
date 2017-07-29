package practice;

public class Instance {
	public int value=234;
	public static String name="dana";
	 //System.out.println("gbs");
	{
		System.out.println("Setting instance");
	}
	Instance(){
		System.out.println("instance initaller");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Instance init=new Instance();
        System.out.println(init.value);
        System.out.println(Instance.name);
	}

}
