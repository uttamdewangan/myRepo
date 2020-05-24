package Singletion;

import java.io.ObjectInputStream.GetField;

public class DesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton s1=Singleton.getSingleton();
		Singleton s2=Singleton.getSingleton();
		
		System.out.println("s1  : " +s1);
		System.out.println("s1  : " +s2);
		
		System.out.println(s1.equals(s2));
		
	}

}
