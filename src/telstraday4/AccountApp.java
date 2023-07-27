package telstraday4;
class Account
{
	int accountId;
	String accountHolderName;
	double balance;
	Account(int accountId,String accountHolderName,double balance)
	{
		this.accountId=accountId;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
	}
	void displayAccountDetails()
	{
		System.out.println("account id : "+accountId);
		System.out.println("account holdername : "+accountHolderName);
		System.out.println("balance : "+balance);
	}
	void withdraw(double w) {
		this.balance-=w;
	}
	void deposit(double d)
	{
		this.balance+=d;
	}
	double getBalance()
	{
		return balance;
	}
}
public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account(1001,"manu",5000);
		account.displayAccountDetails();
		account.deposit(3000);
		System.out.println("balance after depositing:"+account.getBalance());
		account.withdraw(2000);
		System.out.println("balance after withdrawing:"+account.getBalance());
	}

}
