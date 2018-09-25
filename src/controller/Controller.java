package controller;

//Import section
import model.GolfProperties;
import javax.swing.JOptionPane;

public class Controller
{
	private GolfProperties userGolf;
	private JOptionPane userInput;
	
	
	//public Controller()
	//{
		//userGolf = new GolfProperties();
	//}
	
	public void start()

	{
		//String response = JOptionPane.showInputDialog(null, "How long did you play?");
		//while(!validInt(response))
		//{
			//response = JOptionPane.showInputDialog(null, "Enter a whole number.");
		//}
		//userGolf.setTimeHours(Integer.parseInt(response));
		
		String userInput = JOptionPane.showInputDialog(null, "What is your name?");
		String name = null;
		userGolf.setName(name); 
		
		userInput = JOptionPane.showInputDialog(null, "How many Hours did you play");
		int timeMinutes = -99;
		if (validInt(userInput)) 
		{
			timeMinutes = Integer.parseInt(userInput);
		}
		userGolf.setTimeHours(timeMinutes);
		
		userInput = JOptionPane.showInputDialog(null, "What was your score?");
		
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
