package Exception1;

public class ClientTest {
	
	//if super class method has not declared any exception using throws clause then subclass 
	//overridden method can't declared any checked exception but it can declared unchecked exception with the throws clause.
	
	//

	public static void main(String[] args) throws Exception {

		Animal a = new Cat();
		a.eat();
		a.sleep();
	}

}
