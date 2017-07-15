package java8;

public class Stud {
	private int id;
	public Stud(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	private String name;
	@Override
	public String toString() {
		return "Stud [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
