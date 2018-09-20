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
	public GolfProperties() 
	{
		
	}
	public GolfProperties(String name, int timeHours, int timeMinutes, int score, double handicap, String golfCourse)
	{
		this.name = name;
		this.timeHours = timeHours;
		this.timeMinutes = timeMinutes;
		this.score = score;
		this.handicap = handicap;
		this.golfCourse = golfCourse;
	}
	
	
}
