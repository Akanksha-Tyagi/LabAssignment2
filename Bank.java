package akanksha.labassignment2;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		
			String user_name;
			int user_account_type;
			Account account=null;
			Scanner sc=new Scanner(System.in);
			
		 System.out.print("Please Enter your name:  ");
		 user_name=sc.nextLine();
		 System.out.println("Please Enter which type of account you want to create :  ");
		 System.out.println("Enter 1-For Savings Account.");
	     System.out.println("2-For Current Account");
	     System.out.println("Enter your option: ");
		 user_account_type=sc.nextInt();
		 
		 switch(user_account_type)
		 {
		   case 1: account=new SavingsAccount(user_name);
		            System.out.print("Your Savings Account has been successfully created . ");
   				   break;
		   case 2: account= new CurrentAccount(user_name);
		           System.out.print("Your Current Account has been successfully created . ");
			       break;
			       
		   default: System.out.print("Sorry you did not choose the valid option...Try again later.");
		       		
           
		 }
		 
		 boolean exitStatus=false;
		 int user_input;
		 do {
			
			 System.out.println();
	        System.out.println("Welcome "+user_name+ " to the bank please chose the option from the list...");
	        System.out.println("Enter 1-To Deposit the money.");
	        System.out.println("2-To Withdraw the money.");
	        System.out.println("3- Display the balance of the account.");
	        System.out.println("Enter 0, to exit the system.");
	        System.out.print("Enter your choice: ");
	        user_input = sc.nextInt();
	        switch (user_input) {
	       
	            case 1: double deposit_amount;
		        		System.out.print("Enter the  the amount of money you want to deposit:  ");
		        		deposit_amount= sc.nextDouble();
		        		account.deposit(deposit_amount);
		        		break;	            
        		case 2:
	            		double withdraw_amount;
	            		
	            		System.out.print("Enter the  the amount of money you want to withdraw:  ");
	            		withdraw_amount= sc.nextDouble();
	            		account.withdraw(withdraw_amount);
	            		break;
	
	            		 
	            case 3:   System.out.println("your Account balance is : "+account.getBalance());
	                	  break;
	
	            		 
	            		
	            case 0: System.out.println("Thanks for coming.");
	                    exitStatus = true;
	                    break;
	            default: System.out.println("\nInvalid Choice");
	        }
	}
	while (!exitStatus);
	sc.close();
	
	}
}
