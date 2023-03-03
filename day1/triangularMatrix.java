package day1;
import java.util.Scanner;

public class triangularMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row size");
		int row=sc.nextInt();
		System.out.println("Enter col size");
		int col=sc.nextInt();
		int array[][]=new int[row][col];
		int num=1;
		char s=' ';
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i>=j)
				{
					array[i][j]=num;
					num++;
				}
				
			}
				
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i>=j) {
				System.out.print(array[i][j]);
				}
			}
			System.out.println();
		}
		
		
		
	}

}
