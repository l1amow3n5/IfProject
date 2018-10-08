package controller;

//Import section
import model.GolfProperties;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Controller
{
	private GolfProperties userGolf;
	//private JOptionPane userInput;
	
	
	public Controller()
	{
		userGolf = new GolfProperties();
	}
	
	public void input()
	{
		String userInput = JOptionPane.showInputDialog(null, "How many hours did you play?");
		int timeHours = -99;
		if (validInt(userInput))
		{
			timeHours = Integer.parseInt(userInput);
					//JOptionPane.showInputDialog(null, "Enter a whole number.");
		}
		userGolf.setTimeHours(timeHours);
		//JOptionPane.showMessageDialog(null, "You typed in: " + userGolf.getTimeHours());
		
		userInput = JOptionPane.showInputDialog(null, "How many minutes did you play");
		int timeMinutes = -99;
		if (validInt(userInput)) 
		{
			timeMinutes = Integer.parseInt(userInput); 
		}
		userGolf.setTimeMinutes(timeMinutes);
		
		userInput = JOptionPane.showInputDialog(null, "What is your name?");
		String name = userInput;
		userGolf.setName(name); 
		
		userInput = JOptionPane.showInputDialog(null, "What was your score?");
		int score = -99;
		if (validInt(userInput))
		{
			score = Integer.parseInt(userInput);
		}
		
		userGolf.setScore(score); 
		
		if (score >= 45)
		{
			JOptionPane.showMessageDialog(null, "Maybe you should practice putting?");
			input();
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Nice Job!!! Your game has really improved."); 
		}
		
		userInput = JOptionPane.showInputDialog(null, "What is your handicap?");
		double Handicap = -99.99;
		if (validDouble(userInput))
		{
			Handicap = Double.parseDouble(userInput);
		}
		userGolf.setHandicap(Handicap);
		
		JOptionPane.showMessageDialog(null, "Your name is " + userGolf.getName() + ". \nYou said you played for " + userGolf.getTimeHours() + " hours and " + userGolf.getTimeMinutes() + " minutes!! " + "\n Your score was " +userGolf.getScore() + " and your handicap was " + userGolf.getHandicap() + "."); 
		
		
		
		
	}
	
	public boolean validInt (String maybeInt) 
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type a whole number");
			
			/*
			boolean isFinished = false;
			int someCount = 0;
			while (isFinished)
			{
				JOptionPane.showInputDialog(null, "maybe you need to go practice putting.");
				
				if (someCount <= 45)
				{
					isFinished = true;
				}
			}
			*/
		}
		return isValid; 
	}
	
	public boolean validDouble(String mightBeDouble)
	{
		boolean isValid = false;
		
		try
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Type in a decimal value AKA a number with a . in the middle");
		}
		return isValid;
	}
	
	
	private void loopy() 
	{
		/*
		//define a variable before the loop
		boolean isFinished = false;
		int someCount = 0;
		while (!isFinished)
		{
//			code
			JOptionPane.showMessageDialog(null, "annoy everyone!!!");
			
			
			someCount++;
			someCount += 1;
			if (someCount >= 10)
			{
				isFinished = true;
			}
		}
		*/
		
	}
	
	
	public void start()
	{
		for (int loop = 1; loop >= 0; loop -= 1)
		{
			input(); 
			
		}
	}
	
	/*ArrayList<Golf> myGolf = new ArrayList<Golf>();
	
	Golf sampleGolf = new Golf();
	Golf otherGolf = new Golf();
	
	myGolf.add(sampleGolf);
	myGolf.add(sampleGolf);
	myGolf.add(otherGolf);
	*/
	
	public void arraymethod()
	{
		ArrayList<String> golfCourse = new ArrayList<String>();
		{
			golfCourse.add("Riverbend");
			golfCourse.add(1,"MickRiley");
			
			golfCourse.remove(1); 
			
		}
		
	}
}
