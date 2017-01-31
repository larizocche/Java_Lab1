package exercise2;

public class BankAccount {

	//instance variables
	private int balance;
	private String name, accountNumber;
	
	//constructor
	public BankAccount (String name, String accountNumber, int balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
	}
	//get for AccountNumber
	public String getAccountNumber() {
		return accountNumber;
	}
	//get for Balance
	public int getBalance() {
		return balance;
	}
	//get for Name
	public String getName() {
		return name;
	}
	//method to withdraw money
	public void withdraw (double withdrawAmount)
	{
		if (withdrawAmount > 0.0){
			balance -= withdrawAmount;
		}
	}
	//method to deposit money
	public void deposit (double depositAmount){
		if (depositAmount > 0.0){
			balance += depositAmount;
		}
	}
	//method to return account information
	public String getAccountInfo(){
		return "\nName\n" + name  +
				"\nAccount Number\n" + accountNumber + 
				"\nYour current Balance is \n" + balance;
	}
}
