package Akanksha.labassignment2;
import java.util.Random;   
public class Account {
	private String memberName;
	private int accountNumber;
	private double accountBalance;
	
	public Account() {
		super();
	}
	public Account(String memberName,double accountBalance) {
		this.memberName = memberName;
		this.accountBalance = accountBalance;
		Random rand = new Random();
		this.accountNumber=Integer.parseInt("" + rand.nextInt(10) + rand.nextInt(10)+ rand.nextInt(10)+
				rand.nextInt(10)+ rand.nextInt(10));
	}
	public String getMemberName() {
		return memberName;
	}
	//In case user name is mis spelled in the documents(fault by the bank thats why we add setter method for name)
	
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public void deposit(double balance)
	{ 
		System.out.println("Before deposit your amount is : "+this.getAccountBalance());
	    
		this.accountBalance=this.accountBalance+balance;
		System.out.println("After deposit your amount is : "+ (this.getAccountBalance()));
	}
	public void withdraw(double balance)
	{
		this.accountBalance=this.accountBalance-balance;
	}
	public double getBalance()
	{
		return (this.getAccountBalance());
		
	}
}


class  SavingsAccount extends Account
{
	private float interest;
	private final int  maximum_withdraw_amount_limit;
	public SavingsAccount(String user_name) {
		super(user_name,0.0);
		this.interest = 5;
		this.maximum_withdraw_amount_limit = 500000;
	}
	public double getBalance()
	{
		return (this.getAccountBalance()+((this.getAccountBalance()*interest*1)/100));
		
	}
	public void withdraw(double balance)
	{ 
		 double min=500.0;
		if(balance<=this.getAccountBalance())
		{
			if(balance<=this.maximum_withdraw_amount_limit  )
			{
				if((this.getAccountBalance()-balance)>=min)
				{
				System.out.println("Transaction completed please take your cash and count it...");
				this.setAccountBalance(this.getAccountBalance()-balance) ;
				System.out.println("Updated Account Balance is: "+ (this.getAccountBalance()));
				}
				else
				{
					System.out.println("Can not complete your transaction because youramount will get less than mininmum limit...please enter less amount.");
				}
			}
			else
			{
				System.out.println("You reached the Withdraw Limit...Sorrry Try again...");
			}
		}
		else
		{
			System.out.println("You do not have sufficient balance to withdraw.");
		}
	}
	
}
class CurrentAccount  extends Account
{
	private  int  tradeLicenseNumber;
	
	public CurrentAccount(String user_name) {
		super(user_name,0.0);
		
		Random rand = new Random();
		this.tradeLicenseNumber=Integer.parseInt("" + rand.nextInt(10) + rand.nextInt(10)+ rand.nextInt(10)+
				rand.nextInt(10)+ rand.nextInt(10));
	}
	public double getBalance()
	{
		return (this.getAccountBalance());
		
	}
	public void withdraw(double balance)
	{
		if(balance<=this.getAccountBalance())
		{
			System.out.println("Transaction completed please take your cash and count it...");
			System.out.println("Updated Account Balance is : "+ (this.getAccountBalance()-balance));
		}
		else
		{
			System.out.println("You do not have sufficient balance to withdraw.");
		}
	}
	
}
