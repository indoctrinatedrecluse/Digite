import com.digite.org.Employee;
import com.digite.org.Executive;
import com.digite.org.Manager;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] E=new Employee[2];
		E[0] = new Employee();
		E[1] = new Employee("Mila",100000);
		for (Employee X:E) {
			X.payslip();
			System.out.println("Salary: "+X.getSalary());
		}
		
		Manager M =  new Manager("Yusuf",200000,40000);
		M.payslip();
		System.out.println("Salary: "+M.getSalary());
		
		Executive Ex =  new Executive("Zevran",180000,36000);
		Ex.payslip();
		System.out.println("Salary: "+Ex.getSalary());
		
		showSalary(M);
		showSalary(Ex);
	}

	private static void showSalary(Employee E) {
		// TODO Auto-generated method stub
		if (E instanceof Manager)
			System.out.println("Manager Salary: "+E.getSalary());
		else if (E instanceof Executive)
			System.out.println("Executive Salary: "+E.getSalary());
		else
			System.out.println("Salary: "+E.getSalary());
	}

}
