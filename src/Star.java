/*
  @ License - MIT 
  @ Author  - Anmol Chachra 
  @ e-mail  - 9914103037anmol@gmail.com
  @ Blog    - codeitplease.wordpress.com */

// This class contains all the parameters we want to be in our star. For e.g Location and Fitness Value
// It also contains a function to call the evaluate function of ProbleSet Class.

public class Star {
	
	private Location loc;  // Location of the star. Object of 'Location' class
	private double fitval; // Fitness of the star.
	
	// defualt constructor
	public Star()
	{
		super();
	}
	
	// constructor
	public Star(Location loc,double fitness)
	{
		super();
		this.loc = loc;
		fitval = fitness;
	}
	
	public void setLocation(Location loc)
	{
		this.loc = loc;
	}
	
	public Location getLocation()
	{
		return this.loc;
	}
	
	public double getFitness()
	{
		return fitval;
	}
	
	public double getFitnessVal()
	{
		fitval = ProblemSet.evaluate(this.loc);
		
		return fitval;
	}
}
