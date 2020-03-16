import java.lang.*;

public class Customer
{
	private String name;
	private int nid;
	private Account accounts[];
	
	public Customer(){}
	public Customer(String name, int nid, int sizeOfArray)
	{
		this.name = name;
		this.nid = nid;
		accounts = new Account [sizeOfArray];
	}
	
	public void setName(String name){this.name = name;}
	public void setNid(int nid){this.nid = nid;}
	
	
	public String getName(){return name;}
	public int getNid() {return nid;}
	
	public void insertAccount(Account a)
	{
		int flag = 0;
		for(int i = 0 ; i<accounts.length; i++)
		{
			if(accounts[i] == null)
			{
				accounts[i] = a;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Account Inserted");}
		else{System.out.println("Can Not Insert");}
	}
	public void removeAccount(Account a){
		int flag = 0;
		
		for(int i = 0; i<accounts.length; i++)
		{
			if(accounts[i] == a)
			{
				accounts[i] = null;
				flag = 1;
				break;
			}
		}
		
		if(flag == 1){System.out.println("Account Removed");}
		else{System.out.println("Can Not Remove");}
	}
	
	
	public void showAllAccounts()
	{
		for(Account a : accounts)
		{
			if(a != null)
			{
				System.out.println("Account Number: "+ a.getAccountNumber());
				System.out.println("Account Holder Name: "+ a.getAccountHolderName());
				System.out.println("Balance: "+ a.getBalance());
				System.out.println();
			}
		}
	}
}