package controlstructures;

public class ReversingNumber {
	public static void main(String[]args) {
		long n=new java.util.Scanner(System.in).nextLong();
		long reverse = 0;
		int count=0;
		while (n != 0) {
			//int remainder = (int)(n % 10);
			reverse = reverse * 10 +n % 10;
			n =n /10;
			count++;
			
			
		}
		//System.out.println(reverse);
		System.out.printf("%0"+count+"d\n",reverse);
	}

}
