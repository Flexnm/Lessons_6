package ctorsEx;

public class Person { // Extra example of the CTORs heigharchy.
	
	private int id;
	private String name;
	private int age;
	
	public Person(int id, String name, int age) {
		setId(id);
		setName(name);
		setAge(age);
	}
	
	public Person(int id) {
		this(id, "None", 0);
	}
	
	public Person() {
		this(0);
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
	
	
	

}
