package day1;
import java.util.Scanner;
public class pr19revRow {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int row;
		System.out.println("row size");
		row=sc.nextInt();
		System.out.println("col size");
		int col=sc.nextInt();
		int array[][]=new int[row][col];
		int temp[][]=new int[row][col];
		int p=1;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				temp[i][j]=array[i][j];
			}
		}
		for(int i=0;i<row;i++)
		{
			p=1;
			for(int j=0;j<col;j++)
			{
				array[i][j]=temp[i][col-p];
						p++;
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		sc.close();
		
	}

}
