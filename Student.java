import java.util.Scanner;
public class Student
{
	public static void main(String args[])
	{
		int rno;
		double cgpa;
		String name,sem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Name:");
		name=sc.nextLine();
		System.out.println("Rno:");
		rno=sc.nextInt();
		System.out.println("CGPA:");
		cgpa=sc.nextDouble();
		System.out.println("Sem:");
		sem=sc.next();
		System.out.println("Student details:");
		System.out.println("Name"+name);
		System.out.println("Sem:"+sem);
		System.out.println("RNo:"+rno);
		System.out.println("CGPA:"+cgpa);
	}
}
	
