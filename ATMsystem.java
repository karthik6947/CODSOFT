import java.util.Scanner;
class BankAccount 
{
	private double balance;
	public BankAccount(double intialbalance){
		this.balance=intialbalance;
	}
	public String deposit(double amount){
		if (amount>0)
		{
			balance+=amount;
			return "Succesfully Deposited Money to your Account" + amount;
			
		}
		else{
			return "Please Enter Positive Amount";
		}
		
	}
	public String withdraw(double amount){
		if (amount>balance)
		{
			return "You have Insufficient Balance in Your Account Please enter the Sufficient Amount";
		}
		else if (amount>0)
		{
			balance-=amount;
			return "you have withdrawn" + amount+" and your remaining balance is"+balance;
		}
		else{
			return "please enter positive amount";
		}
	}
	public String checkBalance(){
		return "Your Balance is "+balance;
	}		
}
class	ATM
{
	private BankAccount account;
	private Scanner scanner=new Scanner(System.in);
	public ATM(BankAccount account){
		this.account=account;
	}
	public void displaymenu(){
		System.out.println("\n WELCOME TO THE ATM");
		System.out.println("1.CHECK BALANCE");
		System.out.println("2.DEPOSIT MONEY");
		System.out.println("3.WITHDRA MONEY");
		System.out.println("4.EXIT FROM THE ATM");
		
	}
	public void transactions(){
		boolean running =true;
		while (running){
			displaymenu();
			System.out.println("Please Selct any Number From (1-4)");
			int option=scanner.nextInt();
			switch(option){
				case 1:
					System.out.println(account.checkBalance());
				     break;
				case 2:
					System.out.println("Enter Amount to Deposit to your Accout : ");
				    double depositmoney=scanner.nextDouble();
					System.out.println(account.deposit(depositmoney));
					break;
				case 3:
					System.out.println("Enter Amount to withdraw from Your Account ");
				    double withdrawmoney=scanner.nextDouble();
					System.out.println(account.withdraw(withdrawmoney));
				    break;
				case 4:
					System.out.println("Thank For  Using This ATM ,come again!!");
				    running=false;
					break;
				default:
					System.out.println("You have  entered wrong option please choose an option between (1-4) ");
			}
			
		}
	}
}
public class ATMsystem	
{
	public static void main(String[]args){
		BankAccount bankaccount=new BankAccount(1000);
		ATM atm=new ATM(bankaccount);
		atm.transactions();
	}
}

