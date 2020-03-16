import java.lang.*;

public class Customer
{
	private String name;
	private int nid;
	private Account account;
	
	public void setName(String name){this.name = name;}
	public void setNid(int nid){this.nid = nid;}
	public void setAccount(Account account){this.account = account;}
	
	public String getName(){return name;}
	public int getNid() {return nid;}
	public Account getAccount(){return account;}
	
	/*
	public void showDetails()
	{
		System.out.println("Name: " + name);
		System.out.println("Nid: " + nid);
		//account.showDetails();
		System.out.println("Account Number: "+ account.getAccountNumber());
		System.out.println("Account Holder Name: "+ account.getAccountHolderName());
		System.out.println("Balance: "+ account.getBalance());
	}
	*/
}