package exercise3;

import javax.swing.JOptionPane;

public class OverloadTest {

	public static void main(String[] args) {
		
		//Call the overloaded methods
		JOptionPane.showMessageDialog(null, "The sum of two integers is " + Overload.sum(10, 5) + "\n"+
				"The sum of the two doubles is " + Overload.sum(10.5, 20.5) + "\n"+
				"The sum of three integers is " + Overload.sum(5, 10, 15) + "\n");
	}

}
