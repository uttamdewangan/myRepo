package ShallowAndDeepCloning;


public class ClientTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address = new Address(1111, "address Line1", "address Line2",
				"Mumbai", 590999);
		Employee1 e1 = new Employee1(1001, "KK", 30,
				"kishan.javatrainer@gmail.com", "pass@123", address);
		
		Employee1 e2=(Employee1) e1.clone();
		e2.getAddress().setCity("Raipur");
		System.out.println("Emp1 :  "+e1);
		System.out.println("Emp2 : "+e2);
		
	}

	
}


