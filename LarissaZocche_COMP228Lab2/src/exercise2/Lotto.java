package exercise2;

public class Lotto {
	
	//array instance variable to hold 3 integers
	private int[] numbers = new int[3];
	
	//constructor that randomly populates the array for a lotto object
	public Lotto(){
				
		//generate 3 random numbers from 1-9
		for(int i = 0; i < numbers.length; i++) {
		      numbers[i] = (int)(Math.random()*9 + 1);
		    }//end for loop
	}
	
	//method to return the array
	public int[] returnArrayNumber(){
		return numbers;
	}
	
	

	
	
	
}
