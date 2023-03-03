package day1;
import java.util.Scanner;

public class pr20LargestInRow {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("row size");
		int row =sc.nextInt();
		System.out.println("col size");
		int col=sc.nextInt();
		int array[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<row;i++)
		{
			int max=array[0][0];
			for(int j=0;j<col;j++)
			{
				if(array[i][j]>max)
				{
					max=array[i][j];
				}
			}
			System.out.println(max);
		}
	}

}
