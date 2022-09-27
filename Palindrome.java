import java.util.Scanner;
public class Palindrome
{
	public static void main(String args[])
	{
		int i,n,rev=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			i=n%10;
			rev=(rev*10)+i;
			n=n/10;
		}
		if(temp==rev)
		System.out.println("palindrome");
		else
		System.out.println("not palindrome");
	}
}
