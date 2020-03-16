import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Account a1 = new Account(1111, "OOP1 Q", 25000);
		Account a2 = new Account(1112, "OOP1 M", 22000);
		Account a3 = new Account(1113, "OOP1 J", 25000);
		Account a4 = new Account(1114, "ICS B25", 22000);
		
		Customer c1 = new Customer("Mohaimen", 1751, 3);
		
		c1.insertAccount(a1);
		c1.insertAccount(a2);
		c1.insertAccount(a3);
		c1.insertAccount(a4);
		System.out.println("-----------------------------");
		
		System.out.println("Name: " + c1.getName());
		System.out.println("Nid: " + c1.getNid());
		c1.showAllAccounts();
		System.out.println("-----------------------------");
		
		c1.removeAccount(a2);
		System.out.println("-----------------------------");
		
		System.out.println("Name: " + c1.getName());
		System.out.println("Nid: " + c1.getNid());
		c1.showAllAccounts();
		System.out.println("-----------------------------");
		
		c1.insertAccount(a4);
		System.out.println("-----------------------------");
		
		System.out.println("Name: " + c1.getName());
		System.out.println("Nid: " + c1.getNid());
		c1.showAllAccounts();
		System.out.println("-----------------------------");
		
		c1.removeAccount(a2);
	}
}