package day2;
import java.util.Scanner;
class stack
{
	int top=-1;
	int capacity=8;
	int stack[]=new int[capacity];
	public boolean isEmpty()
	{
		if(top<=-1)
		{
			
			return true;
			
		}
		else
		{
			
			return false;
		}
		
	}
	public boolean isFull()
	{
		if(top>=capacity-1)
		{
			return true;
		}
		else
		{
			
			return false;
		}
	}
	public void push(int a)
	{
		if(!(isFull()))
		{
		top++;
		stack[top]=a;
		System.out.println("pushed "+stack[top]);
		}
		else
		{
			System.out.println("stack is full");
		}
	}
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("stack empty");
		}
		else
		{
			System.out.println("popped "+stack[top]);
			stack[top]=0;
			--top;
			
		}
	}
	public void display()
	{
		for(int i=0;i<capacity;i++)
		{
			System.out.println(stack[i]);
		}
	}
	public void peek()
	{
		System.out.println(stack[top]);
	}
}
public class day2Pr4 {
	public static void main(String[] args) {
		stack s = new stack();
		Scanner sc = new Scanner(System.in);
		s.pop();
		s.push(56);
		s.push(89);
		s.peek();
		s.push(10);
		s.pop();
		//s.display();
		s.push(56);
		s.push(859);
		s.push(85);
		s.push(84);
		s.push(85);
		s.push(75);
		s.push(89);
		s.peek();
		s.display();
				
		
	}
	

}
