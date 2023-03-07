package Question9;

import java.util.Scanner;

public class CountNumberOfWords {
	public static void main(String[] args) {
		System.out.println("Enter string");
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		if(str.length()!=0)
		{
			count++;
		}
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
