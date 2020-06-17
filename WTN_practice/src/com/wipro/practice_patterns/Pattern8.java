package com.wipro.practice_patterns;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]);
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
