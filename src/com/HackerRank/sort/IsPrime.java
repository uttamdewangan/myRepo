package com.HackerRank.sort;

import java.math.BigInteger;
import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
        BigInteger a=new BigInteger(scan.next());
       
       System.out.println((a.isProbablePrime(10))? "Prime": "not Prime");
       // System.out.println(a.multiply(b));
	}

}
