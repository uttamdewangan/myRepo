package com.String.simple;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello+-^Java+ -Programmer^ ^^-- ^^^ +!";
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(""+str);
	}

}
