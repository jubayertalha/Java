package interfaces;
import classes.*;
public interface EmployeeOperations
{
	void insertEmployee(Employee c);
	void removeEmployee(Employee c);
	Employee getEmployee(String empId);
	void showAllEmployees();
}