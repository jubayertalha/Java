import java.lang.*;

public class Start{
	public static void main(String args[]){
		Account a1 = new Account();
		a1.setAccountHolderName("Talha Jubayer");
		a1.setAccountNumber(1941468);
		a1.setBalance(5500.75);
		a1.showDetails();
		
		Account a2 = new Account("Hasan Shifat",1941460,10166.25);
		a2.showDetails();
	}
}