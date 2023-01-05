package controlstructures;

public class primeNumber {

	public static void main(String[] args) 
	{
	
	int n=new java.util.Scanner(System.in)args{ 
	if(n>0)
	{
		if( n==1)
			System.out.println("niether prime nor composite number");
		else
		{
			for (int i=2;i<=n/2;i++)

				if(n%i==0) {
					System.out.println("not prime number");
					return;
				}
				System.out.println(" prime number");
			
		}
	}
	else
		System.out.println("invalid