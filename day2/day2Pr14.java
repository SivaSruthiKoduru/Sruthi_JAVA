package day2;
import java.util.Scanner;
public class day2Pr14 {
	public static void main(String[] args) {
		Result r=new Result();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and roll number");
		String s = sc.next();
		int roll=sc.nextInt();
		r.getDetails(s,roll);
		System.out.println("Enter marks of 3 subjects");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		r.getMarks(m1, m2, m3);
		
		r.Calculate();
		
		
	}

}
class Student
{
	String name;
	int rollNo;
}
class Exam extends Student
{
	int subject1;
	int subject2;
	int subject3;
	public void getDetails(String Sname,int rn)
	{
		super.name=Sname;
		super.rollNo=rn;
	}
	public void getMarks(int a,int b,int c)
	{
		subject1=a;
		subject2=b;
		subject3=c;
	}
}
class Result extends Exam
{
	int totalMarks;
	public void Calculate()
	{
		totalMarks=super.subject1+super.subject2+super.subject3;
		System.out.println("Name: "+ name);
		System.out.println("Roll no: "+rollNo);
		System.out.println("Total Marks: "+totalMarks);
	}
	
}