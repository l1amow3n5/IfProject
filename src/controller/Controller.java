package controller;

//Import section
import model.GolfProperties;
import javax.swing.JOptionPane;

public class Controller
{
	private GolfProperties userGolf;
	//private JOptionPane userInput;
	
	
	public Controller()
	{
		userGolf = new GolfProperties();
	}
	
	public void start()

	{
		String userInput = JOptionPane.showInputDialog(null, "How long did you play?");
		int timeHours = -99;
		if (validInt(userInput))
		{
			timeHours = Integer.parseInt(userInput);
					//JOptionPane.showInputDialog(null, "Enter a whole number.");
		}
		userGolf.setTimeHours(timeHours);
		//JOptionPane.showMessageDialog(null, "You typed in: " + userGolf.getTimeHours());
	
		userInput = JOptionPane.showInputDialog(null, "What is your name?");
		String name = userInput;
		userGolf.setName(name); 
		
		userInput = JOptionPane.showInputDialog(null, "How many minutes did you play");
		int timeMinutes = -99;
		if (validInt(userInput)) 
		{
			timeMinutes = Integer.parseInt(userInput); 
		}
		userGolf.setTimeMinutes(timeMinutes);
		
		userInput = JOptionPane.showInputDialog(null, "What was your score?");
		int score = -99;
		if (validInt(userInput))
		{
			score = Integer.parseInt(userInput);
		}
		userGolf.setHandicap(score); 
		
		JOptionPane.showMessageDialog(null, "You said you played for " + userGolf.getTimeHours() + " hours!"); 
		
		loopy();	
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
		//define a variable before the loop
		boolean isFinished = false;
		int someCount = 7;
		while (!isFinished)
		{
//			code
			JOptionPane.showMessageDialog(null, "annoy everyone!!!");
			
			
			someCount++;
			someCount += 1;
			if (someCount >= 20)
			{
				isFinished = true;
			}
		}
		
	}
}
