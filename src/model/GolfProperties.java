package model;

public class GolfProperties
{
	//Data member section
	//All numbers => 0
	// boolean => false
	//Objects => null
	private int timeHours;  
	private int timeMinutes; 
	private int score;
	private String name;
	private double handicap;
	private String golfCourse;
	/**
	 * Default Constructor for Golf.
	 * Initializes all variables to valid but "bad" values
	 * Used for later customization.
	 */
	public GolfProperties() 
	{
		this.timeHours = -99;
		this.timeMinutes = -99;
		this.score = -99;
		this.handicap = -99.99;
	}
	/**
	 * 
	 * @param name the name of the player.
	 * @param timeHours the time in hours it takes to finish.
	 * @param timeMinutes the time in minutes it takes to finish.
	 * @param score the final score of the round.
	 * @param handicap the handicap of the player.
	 * @param golfCourse the course that the person is playing at.
	 */
	public GolfProperties(String name, int timeHours, int timeMinutes, int score, double handicap, String golfCourse)
	{
		this.name = name;
		this.timeHours = timeHours;
		this.timeMinutes = timeMinutes;
		this.score = score;
		this.handicap = handicap;
		this.golfCourse = golfCourse; 
	}
	
	public String getName()
	{
		return name; 
	}
	public String getGolfCourse()
	{
		return golfCourse;
	}
	public int getTimeHours()
	{
		return timeHours;
	}
	public int getTimeMinutes()
	{
		return timeMinutes;
	}
	public int getScore()
	{
		return score;
	}
	public double getHandicap()
	{
		return handicap;
	}
	public void setName(String name)
	{
		this.name = name; 
	}
	public void setGolfCourse(String golfCourse)
	{
		this.golfCourse = golfCourse; 
	}
	public void setTimeHours(int timeHours)
	{
		this.timeHours = timeHours;
	}
	public void setTimeMinutes(int timeMinutes)
	{
		this.timeMinutes = timeMinutes;
	}
	public void setScore(int score)
	{
		this.score = score;
	}
	public void setHandicap(double handicap)
	{
		this.handicap = handicap;
	}
}
