package Employee.Prod;
import Employee.Employee;
import Employee.Prod.*;
public class Prod {
	static int prodCommonSalary=7000;
	public static class worker
	{
		static int WorkerSalary=6000;
		static int sal=Employee.EmpCommonSalary+prodCommonSalary+WorkerSalary;
		public static void workermethod()
		{
			System.out.println("your salary:"+sal);
		}
	}

}

