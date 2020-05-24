package com.HackerRank.ProblemSolving;

import java.util.Scanner;

public class JumpingOnCloud {
	
	public static int jumpingOnCloudsV1(int[] array)
	{
		int count=-1;
		for(int i=0;i<array.length;i++,count++)
		{
			if((i+2)<array.length && array[i+2]==0)
			{
				i++;
			}
		}
			
		return count;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c[] = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		int ans = jumpingOnCloudsV1(c);
		System.out.println(ans);
		sc.close();
	}

	

}

//input
/*7
0
0
1
0
0
1
0
output : 4*/
