package interfaces;
import classes.Employee;
public interface EmployeeOperations
{
	void insertEmployee(Employee e);
	void removeEmployee(Employee e);
	Employee getEmployee(String empId);
	void showAllEmployees();
}