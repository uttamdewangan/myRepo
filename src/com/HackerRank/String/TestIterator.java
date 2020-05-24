package com.HackerRank.String;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("Java");
		list.add("4");
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			
			System.out.println(""+itr.next());
		}
		
		
	}

}
