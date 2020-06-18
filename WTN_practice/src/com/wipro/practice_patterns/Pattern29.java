package com.wipro.practice_patterns;

public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(args[0]),c=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
				System.out.print("  ");
			for(int j=n;j>=i;j--)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
	}

}
