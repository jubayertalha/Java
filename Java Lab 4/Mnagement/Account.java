import java.lang.*;

public class Account{
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	public Account(){
		System.out.println("\nEmpty Account\n");
	}
	
	public Account(String accountHolderName,int accountNumber,double balance){
		System.out.println("\nNot Empty Account\n");
		
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void showDetails(){
		System.out.println("Account Holder Name : "+getAccountHolderName());
		System.out.println("Account Number : "+getAccountNumber());
		System.out.println("Account Balance : "+getBalance());
	}
	
	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public void setAccountHolderName(String accountHolderName){
		this.accountHolderName = accountHolderName;
	}
	public String getAccountHolderName(){
		return accountHolderName;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}
}