import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Account a1 = new Account();
		a1.setAccountNumber(1111);
		a1.setAccountHolderName("OOP1 Q");
		a1.setBalance(2300);
		
		System.out.println("Account Number: "+a1.getAccountNumber());
		System.out.println("Account Holder Name: "+a1.getAccountHolderName());
		System.out.println("Balance: "+a1.getBalance());
		
		Account a2 = new Account(2222, "OOP1 M", 1000);
		a2.showDetails();
		
	}
}