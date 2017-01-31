package exercise3;

//import javax.swing.JOptionPane;

public class Overload {
	
	int number1, number2, number3;
	
	//static method SUM 1
	public static int sum (int number1, int number2 ){
		return number1 + number2;
	}
	
	//static method SUM 2
	public static double sum (double number1, double number2){
		return number1+ number2;
	}
	
	//static method SUM 3
	public static int sum (int number1, int number2, int number3){
		return number1 + number2 + number3;
	}
}
