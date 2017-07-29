package practice;

public class Mains {

	public static void main(String[] args) throws CostumerNotFound{
		// TODO Auto-generated method stub
		Costumer c1=new Costumer();
		c1.setId(1);
		c1.setName("devi");
		Costumer c2=new Costumer();
		c2.setId(12);
		c2.setName("sara");
		Costumer c3=new Costumer();
		c3.setId(3);
		c3.setName("tara");
		if(c2.getId()>0){
			throw new CostumerNotFound("devi");
		}
		
	}

}
