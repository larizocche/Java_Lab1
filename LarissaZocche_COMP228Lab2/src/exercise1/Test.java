package exercise1;

import java.util.Random;

import javax.swing.JOptionPane;

public class Test {
	
	String [] questions = {"Which command from the JDK executes a Java application?\n",
						"Which keyword requests memory from the system to store an object?\n",
						"The return type that indicates that a method will not return a value:\n",
						"How are called methods that perform commom tasks and do not require objects?\n",
						"A variable known only within the method in which it's declared is called a(n):\n"};
	
	String [] choices = {"\nA) java. B) javadoc. C) javac. D) javaclass.",
						  "\nA) request B) new C) initialize D) printf",
						  "\nA) int B) double C) void D) float",
						  "\nA) public B) private C) instance variable D) static",
						  "\nA) local variable B) global variable C) private variable D) instance variable"};
	
	String [] answers = {"A", "B", "C", "D", "A"};
	
	int [] visited = {0,0,0,0,0};
	
	
						  
	//Generate random questions
	int idx = 0;
	double score = 0;
	String ans = "";
	boolean ansCorrect = true; 
	int count = 5;
	double percentage = 0;
	
	//method to generate the question randomly
	public void simulateQuestion(){
			String randomQuestions = (questions[idx]);
			String randomChoices = (choices[idx]);
			String aux = randomQuestions + randomChoices;
			ans = JOptionPane.showInputDialog(null, aux);
	}
	
	//method to check the answers
	//compare if the input typed is the correct answer
	public void checkAnswer(){
				
		if (answers[idx].contains(ans)){
			ansCorrect = true;
			JOptionPane.showMessageDialog(null, generateMessage());
			score++;
		}
		else{
			ansCorrect = false;
			JOptionPane.showMessageDialog(null, generateMessage());
		}
	}
		
	// method to display a random message for the user
	//if the answer is correct, generate random messages
	public String generateMessage(){
		Random rand = new Random();
		int randInt = rand.nextInt(4);
		switch (randInt )
		{
		case 0:
			if (ansCorrect)
				return "Very good!";
			else
				return "No. Please try again";
				
		case 1:
			if (ansCorrect)
				return"Excellent!";
			else
				return "Wrong. Try once more.";
		case 2:
			if (ansCorrect)
			return "Keep up the good work!";
			else
				return "Don't give up!";
		case 3:
			if (ansCorrect)
			return "Nice work!";
			else
				return "No.Keep trying!";
		default:
			return "Error";
		}
	}
		
		//method to interact with the user
		public void inputAnswer(){
			while(count > 0){
				idx = new Random().nextInt(questions.length);
				if (visited[idx] == 0){
					simulateQuestion();
					checkAnswer();
					generateMessage();
					visited[idx] = -1;
					count--;
				}	
			}
			percentage = (score/5) * 100;
			double wrongAnswer = 5 - score;
			JOptionPane.showMessageDialog(null, "You got " + percentage + "% correct answers. " + score + " correct answers and " + wrongAnswer +" incorrect");
		}

	}

	
	

