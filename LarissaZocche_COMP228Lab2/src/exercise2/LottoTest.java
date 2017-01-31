package exercise2;

import javax.swing.JOptionPane;

public class LottoTest {

	public static void main(String[] args) {
	
		Lotto user1 = new Lotto();
		int numbers[];
		int count = 5;
		int sum = 0;
		boolean userWin = false;
	
		//ask user to enter three numbers
		while (count > 0 && userWin == false){
			String number = JOptionPane.showInputDialog("Enter the Lotto sum: ");
			
			//convert string to integer
			int number1 = Integer.parseInt(number);
			
			// generates random sum
			user1 = new Lotto();
			numbers = user1.returnArrayNumber();
			sum = numbers[0] + numbers[1] + numbers[2];
			
			//compare the number with the number the user typed
			//if its right the game ends and user wins -> userWin = true
			if (sum == number1){
				userWin = true;
			}
			// decreases the counter (5x)
			count--;
		}
		
		// display message
		//if count = 0 && userWin == false -----------> computer win
		//else user win
		if (count == 0 && userWin == false){
			JOptionPane.showMessageDialog(null, "Computer won");
		}
		else{
			JOptionPane.showMessageDialog(null, "User won");
		}
	}
}
