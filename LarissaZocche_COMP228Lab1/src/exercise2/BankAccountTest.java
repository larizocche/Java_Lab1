package exercise2;

import javax.swing.JOptionPane;

public class BankAccountTest {

	public static void main(String[] args) {
	
		//provide user input for the account
		
		String name = JOptionPane.showInputDialog("Enter account name: ");
		String accountNumber = JOptionPane.showInputDialog("Account number: ");
		String option = JOptionPane.showInputDialog("Press W for Withdraw, D for Deposit and Q to Quit");
		
		//create an object for BankAccount Class
		
		BankAccount customer1 = new BankAccount (name, accountNumber, 500);
		
		if (option.equals("W") || option.equals("w")){
			String withdrawAmount = JOptionPane.showInputDialog("Enter the amount:");
			double amount = Double.parseDouble(withdrawAmount);
			
			customer1.withdraw(amount);
			customer1.getAccountInfo();
			
		}
		
		if (option.equals("D") || option.equals("d")){
			String depositAmount = JOptionPane.showInputDialog("Enter deposit amount: ");
			double deposit = Double.parseDouble(depositAmount);
			
			customer1.deposit(deposit);
			customer1.getAccountInfo();
		}
		
		if (option.equals("Q") || option.equals("q")){
			System.exit(0);
		}
		JOptionPane.showMessageDialog(null, customer1.getAccountInfo());
		
		
		

	}

}
