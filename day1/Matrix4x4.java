package day1;
import java.util.Scanner;

public class Matrix4x4 {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("row size");
	int row=sc.nextInt();
	System.out.println("col size");
	int col=sc.nextInt();
	int array[][]=new int[row][col];
	int num=1;
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			array[i][j]=num;
			num++;
		}
	}
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			System.out.print(array[i][j] +" ");
		}
		System.out.println();
	}
	sc.close();
	}

}
