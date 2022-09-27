import java.util.Scanner;
public class Reverse
{
	public static void main(String args[])
	{
		int i,n,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		while(n>0)
		{
			i=n%10;
			rev=(rev*10)+i;
			n=n/10;
		}
		System.out.println("rev is"+rev);
	}
}
