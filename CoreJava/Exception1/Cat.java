package Exception1;

import java.io.IOException;

public class Cat extends Animal{

	@Override
	public void eat() throws NullPointerException {
		System.out.println("Animal is eating..");
	}
	
	@Override
	public void sleep() throws IOException{
		System.out.println("Cat is sleeping..");
	}
}
