package Employee;
import Employee.Sales.*;
import Employee.Prod.*;
import java.util.Scanner;

public class Employee {
	public static int EmpCommonSalary=9000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Designation:");
		System.out.println("1.Sales Person");
		System.out.println("2.Sales Manager");
		System.out.println("3.Sales Territory Manager");
		System.out.println("4.Worker");
		int choice=sc.nextInt();
		System.out.println("Welcome");
		
		switch(choice)
		{
		case 1:
			Sales.SalesPerson.SalesPersonmethod();
			break;
		case 2:
			Sales.SalesManager.SalesManagermethod();
			break;
		case 3:
			Sales.SalesTerritoryManager.SalesTerritoryManagermethod();
			break;
		case 4:
			Prod.worker.workermethod();
			break;
			
		
		}
		
	}

}
