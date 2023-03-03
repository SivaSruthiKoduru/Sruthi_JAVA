package Employee.Sales;
import Employee.*;


public class Sales {
	static int salesCommonSalary=8000;
public static class SalesPerson 
{
	static int SalesPersonSalary=8000;
	static int sal=salesCommonSalary+SalesPersonSalary+Employee.EmpCommonSalary;
	public static void SalesPersonmethod()
	{
		System.out.println("your salary:"+sal);
	}
}
public static class SalesManager 
{
	static int SalesManagerSalary=10000;
	static int sal=salesCommonSalary+SalesManagerSalary+Employee.EmpCommonSalary;
    public static void SalesManagermethod()
	{
		System.out.println("your salary:"+sal);
	}
	
}
public static class SalesTerritoryManager
{
	static int SalesTmanagerSalary=7000;
	static int sal=salesCommonSalary+SalesTmanagerSalary+Employee.EmpCommonSalary;
	public static void SalesTerritoryManagermethod()
	{
		System.out.println("your salary:"+sal);
	}
	
}

}

