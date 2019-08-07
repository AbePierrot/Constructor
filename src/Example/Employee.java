package Example;

public class Employee {
	
	private int id;
	private String name;
	private int age;
	static private int idCounter = 0;
	
	
	private Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static Employee makeEmployee(String name, int age) {
		idCounter++;
		return new Employee(idCounter, name, age);
	}
	
	

}
