package day1;
import java.util.Scanner;

public class StudentResult {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of students");
		int n=sc.nextInt();
		System.out.println("Number of Subjects");
		int s=sc.nextInt();
		int student[][]=new int[n][s];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<s;j++)
			{
				student[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=0;j<s;j++)
			{
				sum=sum+student[i][j];
			}
			System.out.println(sum);
		}
		sc.close();
	}
	

}
