package Exception1;

import java.io.IOException;

public class Animal {

	public void eat() {
		System.out.println("Animal is eating..");
	}
	
	public void sleep() throws IOException {
		System.out.println("Animal is sleeping..");
	}
}
