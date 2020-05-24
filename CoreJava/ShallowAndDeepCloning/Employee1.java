package ShallowAndDeepCloning;

public class Employee1 implements Cloneable{
		
	private int id;
	private String name;
	private int age;
	private String email;
	private String password;
	
	private Address address;	
	

	public Employee1(int id, String name, int age, String email,
			String password, Address address) {
	
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.password = password;
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		
		Employee1 emp1=(Employee1)super.clone(); 
		emp1.setAddress((Address)address.clone());
		return emp1;
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age
				+ ", email=" + email + ", password=" + password + ", address="
				+ address + "]";
	}
	
	

}
