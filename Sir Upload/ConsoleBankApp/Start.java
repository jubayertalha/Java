import java.lang.*;
import classes.*;
import interfaces.*;

public class Start
{
	public static void main(String args[])
	{
		SavingsAccount sa1 = new SavingsAccount();
		sa1.setAccountNumber(1111);
		sa1.setBalance(500);
		sa1.setInterestRate(12.5);
		
		SavingsAccount sa2 = new SavingsAccount();
		sa2.setAccountNumber(2111);
		sa2.setBalance(5000);
		sa2.setInterestRate(10.5);
		
		SavingsAccount sa3 = new SavingsAccount();
		sa3.setAccountNumber(3111);
		sa3.setBalance(3300);
		sa3.setInterestRate(2.5);
		
		SavingsAccount sa4 = new SavingsAccount();
		sa4.setAccountNumber(4111);
		sa4.setBalance(4000);
		sa4.setInterestRate(5.5);
		
		FixedAccount fa1 = new FixedAccount();
		fa1.setAccountNumber(5111);
		fa1.setBalance(500);
		fa1.setTenureYear(10);
		
		FixedAccount fa2 = new FixedAccount();
		fa2.setAccountNumber(6111);
		fa2.setBalance(5000);
		fa2.setTenureYear(5);
		
		FixedAccount fa3 = new FixedAccount();
		fa3.setAccountNumber(7111);
		fa3.setBalance(3300);
		fa3.setTenureYear(3);
		
		FixedAccount fa4 = new FixedAccount();
		fa4.setAccountNumber(8111);
		fa4.setBalance(4000);
		fa4.setTenureYear(7);
		
		
		Customer c1 = new Customer();
		c1.setName("ABCD");
		c1.setNid(11223344);
		
		c1.insertAccount(sa1);
		c1.insertAccount(sa2);
		c1.insertAccount(fa1);
		
		Customer c2 = new Customer();
		c2.setName("MNOP");
		c2.setNid(11332244);
		
		c2.insertAccount(fa2);
		c2.insertAccount(fa3);
		c2.insertAccount(sa3);
		
		Customer c3 = new Customer();
		c3.setName("XYZ");
		c3.setNid(11003344);
		
		c3.insertAccount(sa4);
		c3.insertAccount(fa4);
		
		Employee e1 = new Employee();
		e1.setEmpId("1-2-3");
		e1.setName("ASD");
		e1.setSalary(200.5);
		
		Employee e2 = new Employee();
		e2.setEmpId("1-2-4");
		e2.setName("QWE");
		e2.setSalary(2222.5);
		
		Bank b = new Bank();
		
		
		b.insertCustomer(c1);
		b.insertCustomer(c2);
		b.insertCustomer(c3);
		
		b.insertEmployee(e1);
		b.insertEmployee(e2);

		
		b.showAllCustomers();
		b.showAllEmployees();
		
		System.out.println(".......................");
		b.getCustomer(11223344).showAllAccounts();
	}
}
