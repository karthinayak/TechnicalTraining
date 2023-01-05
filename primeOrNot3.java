package controlstructures;

import java.util.Scanner;

public class primeOrNot3 
{
	public static void main(String[] args) 
	{
		int n=new java.util.Scanner(System.in)nextInt();
		if(n>0) 
		{
			if(n==1)
				System.out.println("neither prme nor composite");
			else if(n>3 && (n%2==0||n % 3==0))
				System.out.println("not prime");
		}
		else
		{
			for(int i=5;i*i<=n;i+=6)
				if(n%i==0||n%(i+2)==0)
				{
					System.out.println("not prime");
					return;
				}
			System.out.println("Prime");	
		}
	}
}
