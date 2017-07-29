package practice;

public class ValuesFor {
	public void Loop(){
		java.util.List<String> name=new java.util.ArrayList<String>();
		name.add("Data");
		name.add("Nasa");
		name.add("ISRo");
		//System.out.println(name);
		for(String st:name){
			System.out.println(st);
		}
		
		}
	public void Fins(){
		final String[] names = new String[3];
		names[0] = "Lisa";
		names[1] = "Kevin";
		names[2] = "Roger";
		for(String name : names) {
		System.out.print(name + ", ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = new int[3];
		values[0] = 10;
		values[1] = new Integer(5);
		values[2] = 15;
		for(int s:values) {
			System.out.println(s);
			//System.out.print(values[i]-values[i-1]);
		
		
		}
		ValuesFor n=new ValuesFor();
		n.Loop();
		n.Fins();

	}

}
